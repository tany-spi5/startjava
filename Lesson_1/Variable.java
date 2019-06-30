public class Variable {
    public static void main (String[] args) {
    byte pen = 1;
    short pea = 32000;
    int pencil = 1000000;
    long penny = 20000000000L;
    float speed = 2.67f;
    double quantity = 0.000045158458;
    char letter = 'Z';
    boolean сheck = true;

    System.out.println("pen = " + pen);
    System.out.println("pea = " + pea);
    System.out.println("pencil = " + pencil);
    System.out.println("penny = " + penny);
    System.out.println("speed = " + speed);
    System.out.println("quantity = " + String.format("%.12f",quantity));
    System.out.println("letter = " + letter);	
    System.out.println("check  = " + сheck);
    }
}