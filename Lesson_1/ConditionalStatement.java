Public class ConditionalStatement {
    public static void main (String[] args) {
        String letter = "T";
        System.out.println(letter);
        int Age = 40;
        if (Age > 20) {
            System.out.println("My age > 20");
        }
        System.out.println();
        boolean isMan = false;
        if (isMan) {
            System.out.println("I am a man");
        }
        if (!(isMan)) {
            System.out.println("I am a woman");
        }
        System.out.println();
        float growth = 1.64f;
        if (growth < 1.80) {
            System.out.println ("My growth < 1.80");
        } else {
            System.out.println ("My growth > 1.80");
        }
        System.out.println();
        if (letter == "M") {
            System.out.println ("my name begin with M");
        } else if (letter == "I") {
            System.out.println ("my name begin with I");
        } else {
            System.out.println ("my name begin with " + letter);
        }
    }
}