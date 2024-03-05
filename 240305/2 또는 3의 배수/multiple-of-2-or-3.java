import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i < x + 1; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}