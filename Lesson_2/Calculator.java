public class Calculator {
    private int number1 = 123;
    private int number2 = 3;
    private String operation = "+";

    public int getNumber1() {
        return number1;
    }

    void setNumber1(int number1) {
        if (number1 == 0) {
            System.out.println("zero");
        } else {
            this.number1 = number1;
        }
    }

    public int getNumber2() {
        return number2;
    }
    
    void setNumber2(int number2) {
        if (number2 == 0) {
            System.out.println("zero");
        } else {
            this.number2 = number2;
        }
    }

    public String getOperation() {
        return operation;
    }

    void setOperation(String operation) {
        if (operation == "") {
            System.out.println("empty meaning");
        } else {
            this.operation = operation;
        }
    }

        switch (operation) {
        case "+":
            System.out.println("sum result = " + ( number1 + number2));
            break;
        case "-":
            System.out.println("difference result = " + ( number1 - number2));
            break;
        case "*":
            System.out.println("increase result = " + ( number1 * number2));
            break;
        case "/":
            System.out.println("division result = " + ( number1 / number2));
            break;
        case "^": int result = 1;
            for(int i = 1; i <= number2; i++) {
                result *= number1;
            }
            System.out.println("degree  result = " + result);
            break;
        case "%": 
            System.out.println("%  result = " + ( number1 % number2));
            break; 
        default:
            System.out.println("unknown operation = " + operation);
            break;
        }
} 