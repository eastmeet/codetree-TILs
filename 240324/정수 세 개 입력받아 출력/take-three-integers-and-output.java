import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.printf("%d %d %d", a, b, c);
        } catch(InputMismatchException e) {
            System.out.println("유효한 정수가 아닙니다");
             System.out.println("예외 메시지: " + e.getMessage());
        }

    }

}