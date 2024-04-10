import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result;

        if (x > y) {
            result = x - y;
        } else {
            result = y - x;
        }

        System.out.println(result);
    }
}