import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int x = func(N);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static int func(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        return sum / 10;

    }
}