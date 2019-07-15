public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.sex = 'm';
        myWolf.nickname = "Piter";
        myWolf.weight = 35f;
        myWolf.age = 20;
        myWolf.color = "gray";

        System.out.println("sex = " + myWolf.sex);
        System.out.println("nickname = " + myWolf.nickname);
        System.out.println("weight = " + myWolf.weight);
        System.out.println("age = " + myWolf.age);
        System.out.println("color = " + myWolf.color);

        myWolf.move();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}