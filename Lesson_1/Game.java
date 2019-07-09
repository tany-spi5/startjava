public class Game {
    public static void main (String[] args) {
        int number = 45;
        int i;
        System.out.println();

        if (number >= 50) {
            if (number >= 75) {
                for (i = 75; i <= 100; i++) {
                    if (number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            } else {
                for (i = 74; i >= 50; i--) {
                    if (number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            }
        } else {
            if (number >= 25) {
                for (i = 25; i <= 49; i++) {
                    if (number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            } else {
                for (i = 1; i <= 24; i++) {
                    if (number == i) {
                        System.out.println("find number =" + i);
                        break;
                    }
                }
            }
        }
    }
}