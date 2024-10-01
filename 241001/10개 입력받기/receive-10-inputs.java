import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) { 
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    break;
                }
            }
            int sum = Arrays.stream(arr).sum();
            double cnt = Arrays.stream(arr)
                        .filter(num -> num != 0)
                        .count();
            double avg = sum / cnt;
            double roundedAvg = Math.round(avg * 10.0) / 10.0;
            System.out.print(sum + " " + avg);
        }

    }
}