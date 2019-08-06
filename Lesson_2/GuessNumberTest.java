//package com.journaldev.examples;
import java.util.Random;
import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        int puzzleNumber1;
        int playerNumber1;
        String continuation;
        Scanner scan = new Scanner(System.in); 
        do {
            System.out.println("Enter the first player");
            String player1 =scan.next();
            System.out.println("Enter the second player");
            String player2 =scan.next();
            Random random = new Random();
            puzzleNumber1 = random.nextInt(100);
            System.out.println("puzzleNumber = " + puzzleNumber1);
            Player  peter = new Player(player1, 25);
            Player  john = new Player(player2, 30);
            playerNumber1 = 1;
            GuessNumber  myNumber = new GuessNumber(puzzleNumber1, playerNumber1, player1, player2);
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