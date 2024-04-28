import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            checkEven(a);
            checkEven(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkEven(int x){
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}