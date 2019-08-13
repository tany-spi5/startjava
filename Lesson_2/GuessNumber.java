import java.util.Random;
public class GuessNumber {
    private int puzzleNumber;
    private int playerNumber;  // число от 1 до 100
    private String name1;
    private String name2;
    private  Player  peter;
    private  Player  john;
    private String name;
   // private String Peter.name;
    public GuessNumber( String name1, String name2, Player  peter, Player  john ) {
        this.name1 = name1;
        this.name2 = name2; 

    }
    public String getName() {
        return name;
    }
    public   Player getPeter() {
        return peter;
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
        Player  peter = new Player(name1);
        Player  john = new Player(name2);
        do {
            System.out.println(peter.getName());
            game();
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
            System.out.println(john.getName());
            game();
            verification();
            if (puzzleNumber == playerNumber) {
                break;
            }
        }
        while (puzzleNumber != playerNumber);

    }
}

