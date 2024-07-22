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

    public static int find(int dividend, int divisor) {

        int mod = dividend % divisor;
        int q = dividend / divisor;

        if (q == 0) {
            return 1;
        }

        if (mod == 0)  {
            return dividend;
        }

        if (mod == 1) {
            return divisor;
        }

        return mod;
    }
}