//package com.journaldev.examples;
import java.util.Random;
import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        int puzzleNumber1;
        int playerNumber1;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the first player");
        String player1 =scan.next();
        System.out.println("Enter the second player");
        String player2 =scan.next();
        Random random = new Random();
        puzzleNumber1 = random.nextInt(100);
        System.out.println("puzzleNumber = " + puzzleNumber1);
        Player  peter = new Player(player1, 25);
        playerNumber1 = 1;
        GuessNumber  myNumber = new GuessNumber(puzzleNumber1, playerNumber1);
        System.out.println(peter.getName());
        System.out.println(myNumber.getPlayerNumber());
        myNumber.verification();
        Player  john = new Player(player2, 30);
        System.out.println(john.getName());
        myNumber.game();
        myNumber.verification();
        do {
            System.out.println(peter.getName());
            myNumber.game();
            myNumber.verification();
            System.out.println(john.getName());
            myNumber.game();
            myNumber.verification();
            
        }
        while (myNumber.getPuzzleNumber() != myNumber.getPlayerNumber());
    }
}