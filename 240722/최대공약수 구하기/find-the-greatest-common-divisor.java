import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // 최대 공약수
            // n 과 m 중의 누가 큰가?
            int q = m % n;
            while (m % n != 0) {
                m = n;
                n = q;
            }

            System.out.println(q);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}