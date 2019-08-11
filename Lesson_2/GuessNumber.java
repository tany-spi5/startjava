import java.util.Random;
public class GuessNumber {
    private int puzzleNumber;
    private int playerNumber;  // число от 1 до 100
    private String player1;
    private String player2;
    public Player  peter;
    public Player  john;
    public GuessNumber( String player1, String player2, Player  peter, Player  john ) {
        this.player1 = player1;
        this.player2 = player2; 
                    
    }

    public int getPuzzleNumber() {
        return puzzleNumber;
    }

    public void setPuzzleNumber(int puzzleNumber1) {
        if (puzzleNumber ==.0) {
            System.out.println("zero");
        } else {
            puzzleNumber = puzzleNumber1;
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber1) {
        if (playerNumber ==.0) {
            System.out.println("zero");
        } else {
            playerNumber = playerNumber1;
        }
    }

    public void game() {
        if (puzzleNumber > playerNumber) {
            playerNumber = playerNumber + 1;
            System.out.println("playerNumber =" + playerNumber);
        }       
    }

     public void verification() {
        if (puzzleNumber == playerNumber) {
            System.out.println("find number =" + playerNumber);
        } 
    }     
    
    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(100);
        System.out.println("puzzleNumber = " + puzzleNumber);
        playerNumber = 0;
        Player  peter = new Player(player1, 25);
        Player  john = new Player(player2, 30);
        do {
            System.out.println(player1);
            System.out.println(peter.name);
            game();
           // Player  peter1 = new Player(player1, 25, playerNumber);
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
            System.out.println(player2);
            game();
          //  Player  john1 = new Player(player2, 30, playerNumber);
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
        }
        while (puzzleNumber != playerNumber);

    }
}

