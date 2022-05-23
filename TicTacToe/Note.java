package TicTacToe;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Michael Schneider <michael.schneider@bbbaden.ch>
 */
public class Note implements Externalizable, Comparable<Note> {

    private String player1;
    private String player2;

    public Note() {
    }

    public Note(final String player1, final String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setText(String player2) {
        this.player2 = player2;
    }

    @Override
    public int getVersion() {
        return 1;
    }

    @Override
    public void externalize(DataOutputStream out) throws IOException {
        Util.writeUTF(player1, out);
        Util.writeUTF(player2, out);
    }

    @Override
    public void internalize(int version, DataInputStream in) throws IOException {
        player1 = Util.readUTF(in);
        player2 = Util.readUTF(in);

    }

    @Override
    public String getObjectId() {
        return "Note";
    }

    @Override
    public int compareTo(Note o) {
        return player1.toLowerCase().compareTo(o.getPlayer1().toLowerCase());
    }
}
