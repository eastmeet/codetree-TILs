import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            
            if (a >= b) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

            if (a > b) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            
            System.out.println(b >= a ? "1" : "0");
            System.out.println(b > a ? "1" : "0");
            System.out.println(b == a ? "1" : "0");
            System.out.println(b != a ? "1" : "0");
            
        }
    }
}