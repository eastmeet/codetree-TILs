import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.


        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = findGCD(n, m);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findGCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return findGCD(m, n % m);
    }
}