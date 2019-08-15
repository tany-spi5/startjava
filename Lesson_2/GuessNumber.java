import java.util.Random;
public class GuessNumber {
    private int puzzleNumber;
    private int playerNumber;  // число от 1 до 100
    private  Player  player1;
    private  Player  player2;
    private String name;
    public GuessNumber(Player player1, Player player2 ) {
    }
    public String getName() {
        return name;
    }
   
    public void game1() {
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
     //   Player player1 = new Player(name1);
     //   Player player2 = new Player(name2);
        do {
            System.out.println(player1.getName());
            game1();
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
            System.out.println(player2.getName());
            game1();
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
        }
        while (puzzleNumber != playerNumber);

    }
}

