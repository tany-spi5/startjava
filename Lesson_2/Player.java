public class Player {
    private String name;
    private int age;
    private int number;
    public Player(String name, int age, int playerNumber) {
        this.name = name;
        this.age = age;
        number=playerNumber;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("empty meaning");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0) {
            System.out.println("zero");
        } else {
            this.age = age;
        }
    }    

}