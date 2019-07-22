public class CalculatorTest {
    public static void main(String[] args) {
        Calculator  mycalc = new Calculator();

        mycalc.setNumber1(2);
        mycalc.setNumber2(10);
        mycalc.setOperation("^");

        System.out.println("First number = " + mycalc.getNumber1());
        System.out.println("Operation = " + mycalc.getOperation());
        System.out.println("Second number = " + mycalc.getNumber2());
    }
}