import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) { 
            // 사용자 입력 
            int[] arr = new int[10];
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    break;
                }
                cnt++;
            }
            
            // 합계, 평균 계산
            int sum = Arrays.stream(arr).limit(cnt).sum();
            double avg = (double) sum / cnt;
            double roundedAvg = Math.round(avg * 10.0) / 10.0;
            System.out.print(sum + " " + roundedAvg);
        }

    }
}