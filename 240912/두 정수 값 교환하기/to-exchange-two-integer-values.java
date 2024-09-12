import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [] result = swap(n, m);
            System.out.print(result[0] + " " + result[1]);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    private static int[] swap(Integer n, Integer m) {
        int temp = n;
        n = m;
        m = temp;
        return new int[]{n,m};
    }
}