import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }

            System.out.print(" ");

            if (a == b) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }
}