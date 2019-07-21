public class CalculatorTest {
    public static void main(String[] args) {
        Calculator  mycalc = new Calculator();

        mycalc.setNumber1(2);
        mycalc.setNumber2(10);
        mycalc.setOperation("^");

        System.out.println("First number = " + mycalc.getNumber1());
        System.out.println("Operation = " + mycalc.getOperation());
        System.out.println("Second number = " + mycalc.getNumber2());

        switch(mycalc.getOperation()) {
        case "+": System.out.println("sum result = " + ( mycalc.getNumber1() + mycalc.getNumber2())); break;
        case "-": System.out.println("difference result = " + ( mycalc.getNumber1() - mycalc.getNumber2())); break;
        case "*": System.out.println("increase result = " + ( mycalc.getNumber1() * mycalc.getNumber2())); break;
        case "/": System.out.println("division result = " + ( mycalc.getNumber1() / mycalc.getNumber2())); break;
        case "^": int result = 1;
            for(int i = 1; i <= mycalc.getNumber2(); i++) {
                result *= mycalc.getNumber1();
            }
            System.out.println("degree  result = " + result); break;
        case "%": System.out.println("%  result = " + ( mycalc.getNumber1() % mycalc.getNumber2())); break; 
        default: System.out.println("unknown operation = " + mycalc.getOperation()); break;
        }
    }
}