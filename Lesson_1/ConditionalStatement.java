import java.util.Scanner;
    class ConditionalStatement {
	    public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Your name begin with letter");
			String letter = scan.nextLine();
			System.out.println(letter);
			int yourAge = 40;
			if (yourAge > 20) {
     	    	System.out.println("My age > 20");
			}
			boolean isMan = false;
			if (isMan == true) {
				System.out.println ("I am a man");
			}
			boolean isWoman = true;
			if (isWoman == true) {
				System.out.println ("I am a woman");
			}
			float growth = 1.64f;
			if (growth < 1.80) {
				System.out.println ("My growth < 1.80");
			} else {
				System.out.println ("My growth > 1.80");
			}
			if (letter == "M") {
				System.out.println ("my name begin with M");	
			} else if (letter == "I") {
				System.out.println ("my name begin with I");	
			}
			else {
				System.out.println ("my name begin with " + letter);
			}
		}
	}