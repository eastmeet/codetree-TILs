import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 최소값
            int min = Math.min(a, Math.min(b,c));
            
            if (a == min) {
                System.out.printf("1 ");
            } else {
                System.out.printf("0 ");
            }

            if (a == b && b == c) {
                System.out.printf("1");
            } else {
                System.out.printf("0");
            }

        }

    }
}