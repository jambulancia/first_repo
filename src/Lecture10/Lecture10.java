package Lecture10;

public class Lecture10 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Animanl animanl = new Animanl();
        m(lion);


    }

    public static void m(Animanl animanl){
        animanl.makeNoise();
        if (animanl instanceof Lion){
            Lion lion = (Lion)animanl;
            lion.makeNoise();
            lion.run();
        }

    }
}

class Animanl{
    void makeNoise(){
        System.out.println("Animal makes noise");
    }
}

class Lion extends Animanl{
    void makeNoise(){
        System.out.println("Lion makes noise");
    }
    void run(){
        System.out.println("i am running");
    }
}

class Frog extends Animanl{
    void makeNoise(){
        System.out.println("Frog makes noise");
    }
}