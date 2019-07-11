public class Game {
    public static void main(String[] args) {
        int puzzleNumber = 45;
        int introduceNumber;  // число от 1 до 1000
        for (introduceNumber = 1; introduceNumber <= 1000; introduceNumber++) {
            if (puzzleNumber == introduceNumber) {
                System.out.println("find number =" + introduceNumber);
                break;
            } else {
                System.out.println("introduce number < puzzle number   " +  introduceNumber);
            }
        }
    }
}