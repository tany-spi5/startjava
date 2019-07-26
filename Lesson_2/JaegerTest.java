public class JaegerTest {
    public static void main(String[] args) {
        Jaeger  Phoenix = new Jaeger("Bracer Phoenix","Mark-5","USA");
       /* Phoenix.setModelName("Bracer Phoenix");
        Phoenix.setMark("Mark-5");
        Phoenix.setOrigin("USA");             */
        Phoenix.setHeight(70.7f);
        Phoenix.setWeight(2.1f);
        Phoenix.setSpeed(3);
        Phoenix.setStrength(8);
        Phoenix.setArmor(9);

        System.out.println(Phoenix.getModelName());
        System.out.println(Phoenix.getMark());
        System.out.println(Phoenix.getOrigin());
        System.out.println(Phoenix.getHeight());
        System.out.println(Phoenix.getWeight());
        System.out.println(Phoenix.getSpeed());
        System.out.println(Phoenix.getStrength());
        System.out.println(Phoenix.getArmor());

        System.out.println(Phoenix.drift());
        Phoenix.move();
        System.out.println(Phoenix.scanKaiju());
        Phoenix.useVortexCannon();

        Jaeger  Tramp = new Jaeger("Tramp","Mark-5","USA");
     /*   Tramp.setModelName("Tramp");
        Tramp.setMark("Mark-5");
        Tramp.setOrigin("USA");        */
        Tramp.setHeight(80.7f);
        Tramp.setWeight(2.2f);
        Tramp.setSpeed(4);
        Tramp.setStrength(8);
        Tramp.setArmor(9);

        System.out.println(Tramp.getModelName());
        System.out.println(Tramp.getMark());
        System.out.println(Tramp.getOrigin());
        System.out.println(Tramp.getHeight());
        System.out.println(Tramp.getWeight());
        System.out.println(Tramp.getSpeed());
        System.out.println(Tramp.getStrength());
        System.out.println(Tramp.getArmor());

        System.out.println(Tramp.drift());
        Tramp.move();
        System.out.println(Tramp.scanKaiju());
    }
}