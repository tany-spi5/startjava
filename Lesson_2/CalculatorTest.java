import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        while (i >= 1) {        
            System.out.print("introduce first number");
            int number1 = scan.nextInt();
        
            System.out.println("introduce operation");
            String operation = scan.next();
            System.out.print("introduce second number");
            int number2 = scan.nextInt();
        
            System.out.println("First number = " + number1);
            System.out.println("Operation = " + operation);
            System.out.println("Second number = " + number2);

            Calculator  myCalc = new Calculator();
            myCalc.setNumber1(number1);
            myCalc.setNumber2(number2);
            myCalc.setOperation(operation);

            myCalc.calc();
            String continuation;
            System.out.println("I would like continue yes/no");
            continuation = scan.next();
            
            if (continuation.equals("yes")) {i++;
                System.out.println("continuation = " + continuation);
            } else if (continuation.equals("no")) {
                i = 0;
                break;
            } else {
                System.out.println("continuation = " + continuation + "you must introduce yes or no");
                continuation = "yes";
               // break; 
            } 
        }
    }
}