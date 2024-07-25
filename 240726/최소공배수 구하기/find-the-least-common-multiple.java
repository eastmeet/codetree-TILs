import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int gcd = getGCD(n, m);
            int x = n / gcd; 
            int y = m / gcd;
            System.out.println(gcd * x * y);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static int getGCD(int n , int m) {
        if (m == 0) {
            return n;
        }
        return getGCD(m, n % m);
    }
}