import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        int size = s.nextInt();
        int count = s.nextInt();
        int[] array = new int[size];
        array = assign(size, array);

        int low, high;
        for (int i = 0; i < count; i++){
            low = s.nextInt();
            high = s.nextInt();
            func(low, high, array);
        }

    }

    static int[] assign(int size, int[] array){
        for (int i = 0; i < size; i++){
            array[i] = s.nextInt();
        }
        return array;
    }
    static void func(int low, int high, int[] array){
        boolean bool = true;
        for (int i = low; i < high; i++){
            if (array[i + 1] > array[i]){
                System.out.println(array[i + 1]);
                bool = false;
                break;
            }
            else if (array[i + 1] < array[i]) {
                System.out.println(array[i]);
                bool = false;
                break;

            }
        }
        if (bool) System.out.println("NOT FOUND");
    }
}