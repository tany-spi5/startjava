public  class Cycle {
	public static void main(String[] args) {
		for(int i=0;i <= 20;i++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		int k=6;
		while(k >= -6) {
				System.out.print(k+" ");
				k=k-2;
		}
		System.out.println(" ");
		int h=10;
		int sum=0;
		do{
			if (h % 2 == 0) {
			}	else {
					System.out.println(h+" odd");
					sum=sum+h;
				}			
			h=h+1;
		}
		while (h<=20);
		System.out.println(sum + " odd ");
	}
 }
