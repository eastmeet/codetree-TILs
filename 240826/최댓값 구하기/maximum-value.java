import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int max = Math.max(x, Math.max(y,z));
            System.out.println(max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}