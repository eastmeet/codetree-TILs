import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = arr[2] + arr[4] + arr[9];
            System.out.println(sum);
        }
    }
}