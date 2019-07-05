public class Calculator {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 3;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        String operation = "+";
        //System.out.println("operation = " + operation);
        int result = 0;
        if (operation == "+") {
            result = number1 + number2;
            System.out.println("+ result = " + result);
        } else if (operation == "-") {
            result = number1 - number2;
            System.out.println("-  result = " + result);
        } else if (operation == "*") {
            result = number1 * number2;
            System.out.println("*  result = " + result);
        } else if (operation == "/") {
            result = number1 / number2;
            System.out.println("/  result = " + result);
        } else if (operation == "^") {
            result = 1; 
            for(int i = 1; i <= number2; i++) {
                result = result * number1;
            }
            System.out.println("^  result = " + result);
        } else if (operation == "%") {
            result = number1 % number2;
            System.out.println("%  result = " + result);
        } else {
            System.out.println("operation = " + operation);
        }
    }
} 