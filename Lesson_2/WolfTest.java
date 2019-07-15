public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.floor = 'w';
        myWolf.age = 15;
        System.out.println("floor = " + myWolf.floor);
        System.out.println("age = " + myWolf.age);
        System.out.println("floor = " + myWolf.floor);
        System.out.println("nickname = " + myWolf.nickname);
        System.out.println("weight = " + myWolf.weight);
        System.out.println("age = " + myWolf.age);
        System.out.println("harlequin = " + myWolf.harlequin);
        myWolf.move();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunt();
    }
}