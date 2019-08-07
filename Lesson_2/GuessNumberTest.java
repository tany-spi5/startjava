//package com.journaldev.examples;
import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        int puzzleNumber;
        int playerNumber;
        String continuation;
        Scanner scan = new Scanner(System.in); 
        do {
            System.out.println("Enter the first player");
            String player1 =scan.next();
            System.out.println("Enter the second player");
            String player2 =scan.next();
            playerNumber = 0;
            Player  peter = new Player(player1, 25, playerNumber);
            playerNumber = 0;
            Player  john = new Player(player2, 30, playerNumber);
            GuessNumber  myNumber = new GuessNumber( player1, player2);
            myNumber.play();
            do {
                System.out.println("I would like continue yes/no");
                continuation = scan.nextLine();
                if (continuation.equals("yes")) {
                    System.out.println("continuation = " + continuation);
                    break;
                } else if (continuation.equals("no")) {
                    break;
                } else {
                    System.out.println("continuation = " + continuation + "  you must enter yes or no");
                }           
            } while ((continuation != "yes") & (continuation != "no"));

        } while (continuation.equals("yes"));


    }
}