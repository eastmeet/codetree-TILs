import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        try (Scanner sc = new Scanner(System.in);) {
            int money = sc.nextInt();

            if (money >= 3000) {
                System.out.println("book");
            } else if (money >= 1000) {
                System.out.println("mask");
            } else if (money >= 500) {
                System.out.println("pen");
            } else {
                System.out.println("no");
            }

        }

    }
}