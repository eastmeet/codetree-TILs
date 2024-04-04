import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        int div = 3;
        int sum = x + y + z;
        int avg = sum / div;
        System.out.println(sum);
        System.out.println(avg);

    }
}