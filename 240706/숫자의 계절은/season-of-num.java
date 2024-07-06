import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int month = sc.nextInt();

            if (month < 1 && month > 12) {
                System.out.println("Error");
            }

            if (month <= 2) {
                System.out.println("Winter");
            } else if (month <= 5) {
                System.out.println("Spring");
            } else if (month <= 8) {
                System.out.println("Summer");
            } else if (month <= 11) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
              
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}