import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int j = 0;

            for (int i = 0; i < n; i++) {        
                for (int k = 0; k < n; k++) {    
                    if (j >= 9) {
                        j = 0;
                    }

                    System.out.print(arr[j] + " ");
                    j++;
                }
                System.out.println();
            }
        }

    }
}