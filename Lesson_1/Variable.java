public class Variable {
       public static void main (String[] args)	{
	          byte KolYader=1;
	          short Kol1=32000;
              int Kol2=1000000;
              Long Kol3=20000000000L;
              float prozessor=2.67f;
              double Kol4=0.000045158458;
              char Kol5='Z';
              boolean Check;
                      Check=true;
                           System.out.println("KolYader=" + KolYader);
                           System.out.println("Kol1=" + Kol1);
                           System.out.println("Kol2=" + Kol2);
                           System.out.println("Kol3=" + Kol3);
                           System.out.println("prozessor=" + prozessor);
                           System.out.println("Kol4=" + String.format("%.12f",Kol4));
                           System.out.println("Kol5=" + Kol5);	
                           System.out.println("Check=" + Check);
          }
}