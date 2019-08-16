import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int puzzleNumber;
    private int playerNumber;  // число от 1 до 100
    private Player player1;
    private Player player2;
    Scanner scan = new Scanner(System.in); 
    public GuessNumber(Player player1, Player player2 ) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(100);
        System.out.println("puzzleNumber = " + puzzleNumber);
        do {
            System.out.println(player1.getName());
            compareNumber();
            player1.setNumber(scan.nextInt());
            System.out.println("number = " + player1.getNumber());
            if (puzzleNumber == player1.getNumber()) {
                System.out.println("find number = " + player1.getNumber());
                break;
            }
            System.out.println(player2.getName());
            compareNumber();
            player2.setNumber(scan.nextInt());
            System.out.println("number = " + player2.getNumber());
            if (puzzleNumber == player2.getNumber()) {
                System.out.println("find number = " + player2.getNumber());
                break;
            }
        }
        while ((puzzleNumber != player1.getNumber()) && (puzzleNumber != player2.getNumber()));
    }

    public void compareNumber() {
        System.out.println("Enter the number");
    }
}

