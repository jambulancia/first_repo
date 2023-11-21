public class Exception {
    public static void main(String[] args) {
        try {
            extracted();
        }
        catch (java.lang.Exception nfe){
            System.out.println("error");
        }
        finally {
            System.out.println("Dude");
        }

    }
    public static void extracted(){
        int myInt = Integer.parseInt("32");
    }
}
