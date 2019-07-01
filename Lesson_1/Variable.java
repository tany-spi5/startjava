public class Variable {
    public static void main (String[] args) {
        byte cores = 1;
        short processor = 32000;
        int disk = 1000000;
        long cooler = 20000000000L;
        float speed = 2.67f;
        double quantity = 0.000045158458;
        char letter = 'Z';
        boolean сheck = true;

        System.out.println("cores = " + cores);
        System.out.println("processor = " + processor);
        System.out.println("disk = " + disk);
        System.out.println("cooler= " + cooler);
        System.out.println("speed = " + speed);
        System.out.println("quantity = " + String.format("%.12f",quantity));
        System.out.println("letter = " + letter);	
        System.out.println("check = " + сheck);
    }
}