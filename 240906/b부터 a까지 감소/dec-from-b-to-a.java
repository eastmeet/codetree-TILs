import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = b; i >= a; i--) {
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}