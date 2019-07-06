public class Calculator {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 3;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        String operation = "+";
        //System.out.println("operation = " + operation);
        int result = 0;
        System.out.println();
        if (operation.equals("+")) {
            result = number1 + number2;
            System.out.println("sum result = " + result);
        } else if (operation.equals("-")) {
            result = number1 - number2;
            System.out.println("difference  result = " + result);
        } else if (operation.equals("*")) {
            result = number1 * number2;
            System.out.println("increase result = " + result);
        } else if (operation.equals("/")) {
            result = number1 / number2;
            System.out.println("division result = " + result);
        } else if (operation.equals("^")) {
            result = 1; 
            for(int i = 1; i <= number2; i++) {
                result*=number1;
            }
            System.out.println("degree  result = " + result);
        } else if (operation.equals("%")) {
            result = number1 % number2;
            System.out.println("%  result = " + result);
        } else {
            System.out.println("operation  don't support= " + operation);
        }
    }
} 