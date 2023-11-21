package Abstract;

public class Dog extends Animal{
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("hoof hoof");
    }
    public void displayAge(){
        System.out.println(age);
    }
}
