package Static;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Person.res());
    }
}

class Person{
    static int a = 3;
    static int b = 3;
    static final int c = 19;
     static int res(int a,final int b){
         return a + b;
    }

    static {
         a = 1;
         b = 43;
    }
}