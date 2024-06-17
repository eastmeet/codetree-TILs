import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();

            if ((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
}