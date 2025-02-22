import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        divideJustEvenByTwo(arr);

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
            if (j < n - 1) {
                System.out.print(" ");
            }

        }
        
    }

    private  static void divideJustEvenByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
        }
    }
}