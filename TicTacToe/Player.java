/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Harish
 */
public class Player {

    public static int i;

    public static boolean player1 = true;
    public static boolean player2;

    public static boolean btn1_x;
    public static boolean btn1_o;

    public static boolean btn2_x;
    public static boolean btn2_o;

    public static boolean btn3_x;
    public static boolean btn3_o;

    public static boolean btn4_x;
    public static boolean btn4_o;

    public static boolean btn5_x;
    public static boolean btn5_o;

    public static boolean btn6_x;
    public static boolean btn6_o;

    public static boolean btn7_x;
    public static boolean btn7_o;

    public static boolean btn8_x;
    public static boolean btn8_o;

    public static boolean btn9_x;
    public static boolean btn9_o;

    public static void setValues() {
        i = 0;
        player1 = true;
        btn1_x = false;
        btn1_o = false;

        btn2_x = false;
        btn2_o = false;

        btn3_x = false;
        btn3_o = false;

        btn4_x = false;
        btn4_o = false;

        btn5_x = false;
        btn5_o = false;

        btn6_x = false;
        btn6_o = false;

        btn7_x = false;
        btn7_o = false;

        btn8_x = false;
        btn8_o = false;

        btn9_x = false;
        btn9_o = false;

        Computer.r9 = false;
        Computer.r8 = false;
        Computer.r7 = false;
        Computer.r6 = false;
        Computer.r5 = false;
        Computer.r4 = false;
        Computer.r3 = false;
        Computer.r2 = false;
        Computer.r1 = false;
        
        Computer.field1=true;
        Computer.field2=true;
        Computer.field3=true;
        Computer.field4=true;
        Computer.field5=true;
        Computer.field6=true;
         Computer.field7=true;
        Computer.field8=true;
        Computer.field9=true;
         Game.isFinished=false;

    }

}
