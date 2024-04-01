import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        if (y != 0) {
            System.out.printf("%d / %d = %d\n", x, y, x / y);
        } else {
            System.out.println("y should'n zero");
        }
    }
}