public class Variable {
    public static void main (String[] args)	{
	    byte quantity = 1;
        short quantity1 = 32000;
        int quantity2 = 1000000;
        long quantity3 = 20000000000L;
        float speed = 2.67f;
        double quantity4 = 0.000045158458;
        char letter = 'Z';
        boolean сheck = true;

        System.out.println("quantity = " + quantity);
        System.out.println("quantity1 = " + quantity1);
        System.out.println("quantity2 = " + quantity2);
        System.out.println("quantity3 = " + quantity3);
        System.out.println("speed = " + speed);
        System.out.println("quantity4 = " + String.format("%.12f",quantity4));
        System.out.println("letter = " + letter);	
        System.out.println("check = " + сheck);
    }
}