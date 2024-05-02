import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            
            int a = sc.nextInt();

            if (a % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            if (a % 5 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}