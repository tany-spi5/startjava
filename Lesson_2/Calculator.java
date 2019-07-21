public class Calculator {
    private int number1;
    private int number2;
    private String operation;

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
} 