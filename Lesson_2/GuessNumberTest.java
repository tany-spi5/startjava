//package com.journaldev.examples;
import java.util.Random;
import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        int puzzleNumber;
        int playerNumber;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the first player");
        String player1 =scan.next();
        System.out.println(player1);
        System.out.println("Enter the second player");
        String player2 =scan.next();
        System.out.println(player2);
        Random random = new Random();
        puzzleNumber = random.nextInt(100);
        System.out.println(puzzleNumber);
        Player  peter = new Player(player1, 25);
        playerNumber = 1;
        GuessNumber  myNumber = new GuessNumber(puzzleNumber, playerNumber);
     
        System.out.println(playerNumber);
        System.out.println(player1);

       
        Player  john = new Player(player2, 30);
        myNumber.game();
        System.out.println(myNumber.getPlayerNumber());
        System.out.println(player2);
        do {
        System.out.println(player1);
        myNumber.game();
        if (puzzleNumber == playerNumber) { 
            break; 
        }
        System.out.println(myNumber.getPlayerNumber());
        System.out.println(player2);
        myNumber.game();
        if (puzzleNumber == playerNumber) { 
            break; 
        }
        System.out.println(myNumber.getPlayerNumber());
        }
        while (puzzleNumber != playerNumber);
        
    }
}