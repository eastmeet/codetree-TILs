import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i <= 5; i++) {
                System.out.print(n * i);
                System.out.print(" ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
        
    }
}