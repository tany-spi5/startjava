public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setSex('m');
        myWolf.setNickname("Piter");
        myWolf.setWeight(35f);
        myWolf.setAge(7);
        myWolf.setColor("gray");

        System.out.println("sex = " + myWolf.getSex());
        System.out.println("nickname = " + myWolf.getNickname());
        System.out.println("weight = " + myWolf.getWeight());
        System.out.println("age = " + myWolf.getAge());
        System.out.println("color = " + myWolf.getColor());

        myWolf.move();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}