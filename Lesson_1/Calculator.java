import java.util.Scanner;
	class Calculator {
		public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("introduce 2 int numbers");
		int number1 = k.nextInt();
		int number2 = k.nextInt();
		System.out.println("number1 = "+number1);
		System.out.println("number2 = "+number2);
		System.out.println("introduce operation +-*/^%");
		String operation = k.next();
		System.out.println("operation = " + operation);
		int sum = 0;
		if (operation == "+") {
			sum = number1 + number2;
			System.out.println("sum = " + sum);
		} else if (operation == "-") {
            sum = number1 - number2;
            System.out.println("sum = " + sum);
		} else if (operation == "*") {
		    sum = number1 * number2;
		    System.out.println("sum = " + sum);
		} else if (operation == "/") {
		    sum = number1 / number2;
		    System.out.println("sum = " + sum);
		} else if (operation == "^") {
            sum = number1 ^ number2;
            System.out.println("sum = " + sum);
        } else if (operation == "%") {
            sum = number1 % number2;
            System.out.println("sum = " + sum);
        } else {
            System.out.println("operation = " + operation);	
        }

        }                          
    } 