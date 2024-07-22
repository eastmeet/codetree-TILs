import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // 최대 공약수
            // n 과 m 중의 누가 큰가?
            int q = n > m ? find(n, m) : find(m, n);
            System.out.println(q);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int find(int bigger, int smaller) {
        int q = 1;

        while (bigger % smaller != 0) {
            q = bigger % smaller;

            if (q == 0) {
                return smaller;
            }

            bigger = smaller;
            smaller = q;
        }
        
        return q;
    }
}