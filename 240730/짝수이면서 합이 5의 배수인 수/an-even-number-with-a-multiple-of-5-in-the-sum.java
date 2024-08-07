import java.util.*;

public class Main {

    public static boolean isCondition(int n) {
        // 십의자리
        int tensPlace = n / 10;
        int onesPlace = n % 10;
        int sum = tensPlace + onesPlace;
        return ((n % 2 == 0) && (sum % 5 == 0));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)){
            // 2자리 숫자
            int n = sc.nextInt();

            if (isCondition(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}