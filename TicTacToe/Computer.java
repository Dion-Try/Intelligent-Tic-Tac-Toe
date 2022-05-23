/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import com.codename1.ui.Component;
import com.codename1.ui.events.ActionEvent;
import userclasses.StateMachine;
import java.util.Random;

/**
 *
 * @author Harish
 */
public class Computer {

   
    static Random rand = new Random();


    public static boolean r9;
    public static boolean field9 = true;

    public static boolean r8;
    public static boolean field8 = true;

    public static boolean r7;
    public static boolean field7 = true;

    public static boolean r6;
    public static boolean field6 = true;

    public static boolean r5;
    public static boolean field5 = true;

    public static boolean r4;
    public static boolean field4 = true;

    public static boolean r3;
    public static boolean field3 = true;

    public static boolean r2;
    public static boolean field2 = true;

    public static boolean r1;
    public static boolean field1 = true;


    public static int getField() {
        boolean isOccupied = true;
        int returnval = 0;
        
        while (isOccupied) {
            int random = rand.nextInt(8);
            returnval = random;
            random++;
            System.out.println(random);
            if (Player.player2 == true) {
                
                if (random == 9 && field9 != false) {

                    r9 = true;
                    isOccupied = false;
                } else if (field9 == false) {
                  
                    System.out.println("hallo9");

                }
                if (random == 8 && field8 != false) {

                    r8 = true;
                    isOccupied = false;
                }else if (field8 == false) {
                   
                    System.out.println("hallo8");
                }
                if (random == 7 && field7 != false) {

                    r7 = true;
                    isOccupied = false;
                } else if (field7 == false) {
                    
                    System.out.println("hallo7");
                }
                if (random == 6 && field6 != false) {

                    r6 = true;
                    isOccupied = false;
                } else if (field6 == false) {
                    
                    System.out.println("hallo6");
                }
                if (random == 5 && field5 != false) {

                    r5 = true;
                    isOccupied = false;
                } else if (field5 == false) {
                    
                    System.out.println("hallo5");
                }
                if (random == 4 && field4 != false) {

                    r4 = true;
                    isOccupied = false;
                } else if (field4 == false) {
                    
                    System.out.println("hallo4");
                }
                if (random == 3 && field3 != false) {

                    r3 = true;
                    isOccupied = false;
                } else if (field3 == false) {
                   
                    System.out.println("hallo3");
                }
                if (random == 2 && field2 != false) {

                    r2 = true;
                    isOccupied = false;
                } else if (field2 == false) {
                    
                    System.out.println("hallo2");
                }
                if (random == 1 && field1 != false) {
                    r1 = true;
                    isOccupied = false;
                } else if (field1 == false) {
                   
                    System.out.println("hallo1");
                }
            }

        }
        return returnval;
    }

}
