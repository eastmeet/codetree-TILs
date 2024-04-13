import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            if (a < -1000 || a > 1000) {
                throw new IllegalArgumentException("Invalid input");
            }

            if (a >= 113) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}