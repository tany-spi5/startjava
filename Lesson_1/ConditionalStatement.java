public class ConditionalStatement {
    public static void main (String[] args) {
        int Age = 40;
        if (Age > 20) {
            System.out.println("My age > 20");
        }
        System.out.println();
        boolean IsMan = false;
        if (IsMan) {
            System.out.println("I am a man");
        }
        if (!IsMan) {
            System.out.println("I am a woman");
        }
        System.out.println();
        float Growth = 1.64f;
        if (Growth < 1.80) {
            System.out.println ("My growth < 1.80");
        } else {
            System.out.println ("My growth > 1.80");
        }
        System.out.println();
        String Letter = "T";
        System.out.println(Letter);
        if (Letter == "M") {
            System.out.println ("my name begin with M");
        } else if (Letter == "I") {
            System.out.println ("my name begin with I");
        } else {
            System.out.println ("my name begin with " + Letter);
        }
        System.out.println();
    }
}