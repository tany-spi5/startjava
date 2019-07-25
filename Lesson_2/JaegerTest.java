public class JaegerTest {
    public static void main(String[] args) {
        Jaeger  myJaegerOne = new Jaeger();

        myJaegerOne.setModelName("Bracer Phoenix");
        myJaegerOne.setMark("Mark-5");
        myJaegerOne.setOrigin("USA");
        myJaegerOne.setHeight(70.7f);
        myJaegerOne.setWeight(2.1f);
        myJaegerOne.setSpeed(3);
        myJaegerOne.setStrength(8);
        myJaegerOne.setArmor(9);

        System.out.println(myJaegerOne.getModelName());
        System.out.println(myJaegerOne.getMark());
        System.out.println(myJaegerOne.getOrigin());
        System.out.println(myJaegerOne.getHeight());
        System.out.println(myJaegerOne.getWeight());
        System.out.println(myJaegerOne.getSpeed());
        System.out.println(myJaegerOne.getStrength());
        System.out.println(myJaegerOne.getArmor());

        System.out.println(myJaegerOne.drift());
        myJaegerOne.move();
        System.out.println(myJaegerOne.scanKaiju());
        myJaegerOne.useVortexCannon();

        Jaeger  myJaegerSecond = new Jaeger();

        myJaegerSecond.setModelName("Tramp");
        myJaegerSecond.setMark("Mark-5");
        myJaegerSecond.setOrigin("USA");
        myJaegerSecond.setHeight(80.7f);
        myJaegerSecond.setWeight(2.2f);
        myJaegerSecond.setSpeed(4);
        myJaegerSecond.setStrength(8);
        myJaegerSecond.setArmor(9);

        System.out.println(myJaegerSecond.getModelName());
        System.out.println(myJaegerSecond.getMark());
        System.out.println(myJaegerSecond.getOrigin());
        System.out.println(myJaegerSecond.getHeight());
        System.out.println(myJaegerSecond.getWeight());
        System.out.println(myJaegerSecond.getSpeed());
        System.out.println(myJaegerSecond.getStrength());
        System.out.println(myJaegerSecond.getArmor());

        System.out.println(myJaegerSecond.drift());
        myJaegerSecond.move();
        System.out.println(myJaegerSecond.scanKaiju());
    }
}