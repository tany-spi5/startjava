import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("introduce 2 whole number");
        
        int number10 = scan.nextInt();
        int number20 = scan.nextInt();
        Scanner k = new Scanner(System.in);
        System.out.println("introduce operation");
        String operation1 = k.next();
        System.out.println(operation1);

        System.out.println("First number = " + number10);
        System.out.println("Operation = " + operation1);
        System.out.println("Second number = " + number20);

        Calculator  myCalc = new Calculator();
        myCalc.setNumber1(number10 );
        myCalc.setNumber2(number20);
        myCalc.setOperation(operation1);

        myCalc.calc();
    }
}