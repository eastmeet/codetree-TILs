import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 중앙값 구하기
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}