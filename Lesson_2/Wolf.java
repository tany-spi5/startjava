public class Wolf {
    private char sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }
    void setSex(char sex) {
        if (sex == ' ') {
            System.out.println("empty meaning");
        } else {
            this.sex = sex;
        }
    }
    public String getNickname() {
        return nickname;
    }
    void setNickname(String nickname) {
        if (nickname == "") {
            System.out.println("empty meaning");
        } else {
            this.nickname = nickname;
        }
    }
    public float getWeight() {
        return weight;
    }
    void setWeight(float weight) {
        if (weight == 0) {
            System.out.println("zero");
        } else {
            this.weight = weight;
        }
    }
    public int getAge() {
        return age;
    }
    void setAge(int age) {
        if (age > 8) {
            System.out.println("incorrect age");
        } else {
            this.age = age;
        }
    }
    public String getColor() {
        return color;
    }
    void setColor(String color) {
        if (color == "") {
            System.out.println("empty meaning");
        } else {
            this.color = color;
        }
    }
    public void move() {
        System.out.println("you went 1 kilometer");
    }

    public void sit() {
        System.out.println("you sat down");
    }

    public void run() {
        System.out.println("you ran 1 kilometer");
    }

    public void howl() {
        System.out.println("you howled 5 minutes");
    }

    public void hunt() {
        System.out.println("you hunted often");
    }
}