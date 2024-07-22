import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.


        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = (n > m) ? findGCD(n, m) : findGCD(m, n);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findGCD(int bigger, int smaller) {

        if (bigger == smaller) {
            return bigger;
        }

        int GCD = -1;
        int i = 1;
        while (i <= bigger) {
            if ((smaller % i == 0) && (bigger % i == 0)) {
                GCD = i;
            }
            i++;
        }

        return GCD;

    }
}