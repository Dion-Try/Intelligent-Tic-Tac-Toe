/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import com.codename1.ui.Dialog;

/**
 *
 * @author Harish
 */
public class Game {

    public static boolean isFinished;

    public static void changeplayer() {
        if (!isFinished) {
            if (Player.player1 == true) {
                Player.player2 = true;
                Player.player1 = false;
            } else {
                Player.player1 = true;
                Player.player2 = false;
            }

            getWinner();
            Player.i++;
        }

    }

    public static void getWinner() {

        if (Player.btn1_o == true && Player.btn2_o == true && Player.btn3_o == true || Player.btn1_o == true && Player.btn4_o == true && Player.btn7_o == true || Player.btn1_o == true && Player.btn5_o == true && Player.btn9_o == true || Player.btn2_o == true && Player.btn5_o == true && Player.btn8_o == true || Player.btn3_o == true && Player.btn6_o == true && Player.btn9_o == true || Player.btn3_o == true && Player.btn5_o == true && Player.btn7_o == true || Player.btn4_o == true && Player.btn5_o == true && Player.btn6_o == true || Player.btn7_o == true && Player.btn8_o == true && Player.btn9_o == true) {
            Dialog.show("You won", "player1 you're the winner ", "OK", null);
            isFinished = true;

        } else if (Player.btn1_x == true && Player.btn2_x == true && Player.btn3_x == true || Player.btn1_x == true && Player.btn4_x == true && Player.btn7_x == true || Player.btn1_x == true && Player.btn5_x == true && Player.btn9_x == true || Player.btn2_x == true && Player.btn5_x == true && Player.btn8_x == true || Player.btn3_x == true && Player.btn6_x == true && Player.btn9_x == true || Player.btn3_x == true && Player.btn5_x == true && Player.btn7_x == true || Player.btn4_x == true && Player.btn5_x == true && Player.btn6_x == true || Player.btn7_x == true && Player.btn8_x == true && Player.btn9_x == true) {
            Dialog.show("You won", "player2 you're the winner ", "OK", null);
            isFinished = true;
        } else if (Player.i == 8) {
            Dialog.show("Draw", "Draw ", "OK", null);
            isFinished = true;

        }

    }

}
