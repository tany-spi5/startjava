public class Game {
    public static void main(String[] args) {
        int puzzle_number = 45;
        int i;  // число от 1 до 100
        System.out.println();

        if (puzzle_number >= 50) {
            if (puzzle_number >= 75) {
                for (i = 75; i <= 100; i++) {
                    if (puzzle_number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            } else {
                for (i = 74; i >= 50; i--) {
                    if (puzzle_number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            }
        } else {
            if (puzzle_number >= 25) {
                for (i = 25; i <= 49; i++) {
                    if (puzzle_number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            } else {
                for (i = 1; i <= 24; i++) {
                    if (puzzle_number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            }
        }
    }
}