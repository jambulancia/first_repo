package Static;

public class Math {
    static int max(int a, int b){
        return  (a>b) ? a : b;
    }
    static int min(int a, int b){
        return (a > b) ? b : a;
    }

    static int pow(int a, int b){
        int n = a;
        for (int i = 0; i < b - 1; i++){
            a *= n;
        }
        return a;
    }

}
