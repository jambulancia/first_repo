package Static;

public class Main {
    public static void main(String[] args) {
        Human.description = "Yusuf";
        Human human = new Human("Abdu", 18);
        human.getAll();
        human.description = "bad";
        Human human1 = new Human("Jabbor", 43);
        human.getAll();
        human1.getAll();
        Human.getall();
        System.out.println(Math.pow(5,3));
    }
}

class Human{
    private static int count;
    public static String description;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void getDescription(){
        System.out.println(description);
    }

    public void getAll(){
        System.out.println(name + " " + age + " " + description + " " + count);
    }

    public static void getall(){
        System.out.println(description);
    }
}
