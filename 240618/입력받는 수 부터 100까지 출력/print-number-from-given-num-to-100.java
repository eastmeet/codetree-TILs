import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);){
            int n = sc.nextInt();

            if (n <= 100) {

                for (int i = n; i <= 100; i++) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}