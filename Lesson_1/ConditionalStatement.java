import java.util.Scanner;
    class ConditionalStatement {
	    public static void main (String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Your name begin with letter");
			String Letter=scan.nextLine();
			System.out.println(Letter);
		int YourAge=40;
		if (YourAge > 20) {
         	System.out.println("My age > 20");
		}
		boolean IsMan=false;
		if (IsMan==true) {
			System.out.println ("I am a man");
		}
		boolean IsWoman=true;
		if (IsWoman==true) {
			System.out.println ("I am a woman");
		}
		float growth=1.64f;
		if (growth < 1.80) {
			System.out.println ("My growth < 1.80");
		} else {
			System.out.println ("My growth > 1.80");
		}
		if (Letter=="M") {
			System.out.println ("my name begin with M");	
		} else if (Letter=="I") {
			System.out.println ("my name begin with I");	
		}
		else {
			System.out.println ("my name begin with " + Letter);
		}
	}
}