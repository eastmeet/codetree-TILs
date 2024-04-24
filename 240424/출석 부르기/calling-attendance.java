import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("John");
            } else if (n == 2) {
                System.out.println("Tom");
            } else if (n == 3) {
                System.out.println("Paul");
            } else {
                System.out.println("Vacancy");
            }

        }
    }
}