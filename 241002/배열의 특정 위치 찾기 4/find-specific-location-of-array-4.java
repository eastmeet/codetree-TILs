import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
        
            int arr[] = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    break;
                }

            }
            
            int[] newArray = Arrays.stream(arr)
                               .filter(num -> num != 0)
                               .toArray();
            long cnt = Arrays.stream(newArray).filter(num -> num % 2 == 0).count();
            int sum = Arrays.stream(newArray).filter(num -> num % 2 == 0).sum();
            System.out.println(cnt + " " + sum);
        }
    }
}