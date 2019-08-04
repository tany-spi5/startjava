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

    public void setPuzzleNumber(int puzzleNumber) {
        if (puzzleNumber ==.0) {
            System.out.println("zero");
        } else {
            this.puzzleNumber = puzzleNumber;
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        if (playerNumber ==.0) {
            System.out.println("zero");
        } else {
            this.playerNumber = playerNumber;
        }
    }

    public game() {
        if (puzzleNumber == playerNumber) {
            System.out.println("find number =" + playerNumber);
        } else if (puzzleNumber > playerNumber) {
            playerNumber = playerNumber + 1;
        } 
        
    }     

}

