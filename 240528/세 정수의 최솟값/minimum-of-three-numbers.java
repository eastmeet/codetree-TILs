import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int min = (a < b) ? a : b;
            min = (c < min) ? c : min;

            System.out.println(min);

        }

    }
}