import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) { 
            int a = sc.nextInt();
            int b = sc.nextInt();

            boolean isEven = (a % 2 == 0) ? true : false;
            while (a <= b) {
                if (isEven) {
                    System.out.print(a + " ");
                    a += 2;
                } else {
                    a++;
                }
            }
        }

    }
}