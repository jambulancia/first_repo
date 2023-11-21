import java.util.*;

public class Ceck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            switch (s){
                case "one":
                    System.out.println("1");
                    break;
                case "two":
                    System.out.println("2");
                    break;
                case "three":
                    System.out.println("3");
                    break;
                case "four":
                    System.out.println("4");
                    break;
                default:
                    break;
            }
        }
        System.out.println("you are out");
    }
}
