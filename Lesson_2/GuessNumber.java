public class GuessNumber {
    private int puzzleNumber;
    private int playerNumber;  // число от 1 до 100
    public GuessNumber(int puzzleNumber1, int playerNumber1) {
        puzzleNumber = puzzleNumber1;
        playerNumber = playerNumber1;
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
    
}

