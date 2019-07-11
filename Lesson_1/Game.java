public class Game {
    public static void main(String[] args) {
        int puzzleNumber = 45;
        int i;  // число от 1 до 1000
        System.out.println();
            for (i = 1; i <= 1000; i++) {
                if (puzzleNumber == i) {
                    System.out.println("find number =" + i);
                    break;
                } else {
                	System.out.println("introduce number < puzzle number   " +  i);
                }
            }
    }
}