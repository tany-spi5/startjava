import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        String continuation;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("enter the first number");
            int number1 = scan.nextInt();
        
            System.out.println("enter the operation");
            String operation = scan.next();

            System.out.print("enter the second number");
            int number2 = scan.nextInt();
        
            System.out.println("First number = " + number1);
            System.out.println("Operation = " + operation);
            System.out.println("Second number = " + number2);

            Calculator  myCalc = new Calculator();
            myCalc.setNumber1(number1);
            myCalc.setNumber2(number2);
            myCalc.setOperation(operation);

            myCalc.calculate();
            System.out.println("I would like continue yes/no");
            continuation = scan.next();
            
            if (continuation.equals("yes")) {
                System.out.println("continuation = " + continuation);
            } else if (continuation.equals("no")) {
                break;
            } else {
                System.out.println("continuation = " + continuation + "  you must enter yes or no");
                //i = 1;
                while ((continuation != "yes") & (continuation != "no")) {
                    System.out.println("I would like continue yes/no");
                    continuation = scan.next();
                    if (continuation.equals("yes")) {
                        System.out.println("continuation = " + continuation);
                        break;
                    } else if (continuation.equals("no")) {
                        break;
                    } else {
                        System.out.println("continuation = " + continuation + "  you must enter yes or no");
                    }
                }
            } 
        } while (continuation.equals("yes"));
    }
}