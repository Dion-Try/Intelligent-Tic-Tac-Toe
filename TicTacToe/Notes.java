/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import com.codename1.io.Storage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Harish
 */
public class Notes {

    private final ArrayList<Note> notes = new ArrayList<>();
    private final static String NOTE_PREFIX = "note_";

    public Notes() {
        final Storage storage = Storage.getInstance();
        for (String noteName : storage.listEntries()) {
            if (noteName.startsWith(NOTE_PREFIX)) {
                notes.add((Note) storage.readObject(noteName));
            }
        }
        Collections.sort(notes);
    }

    public Note[] getNotes() {
        Note[] notesArray = new Note[notes.size()];
        notesArray = notes.toArray(notesArray);
        return notesArray;
    }

    public void addNote(final Note note) {

        notes.add(note);
        writeNote(note);

        Collections.sort(notes);
    }

    public void deleteNote(final Note note) {
        final Storage storage = Storage.getInstance();

        notes.remove(note);

        for (String noteName : storage.listEntries()) {
            if (noteName.startsWith(NOTE_PREFIX) && (Note) storage.readObject(noteName) == note) {
                storage.deleteStorageFile(noteName);
                break;
            }
        }
    }

    private void writeNote(final Note note) {
        final Storage storage = Storage.getInstance();
        final String baseName = getKeyName(note);
        int index = 0;

        String fileName;
        do {
            fileName = baseName + "_" + index++;
        } while (storage.exists(fileName));

        storage.writeObject(fileName, note);
    }

    private String getKeyName(final Note note) {
        final Storage storage = Storage.getInstance();
        return NOTE_PREFIX + String.valueOf(note.hashCode());
    }
}
