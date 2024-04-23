import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int t0 = sc.nextInt();

        if (t0 >= 100) {
            System.out.println("vapor");
        } else if (t0 < 0) {
            System.out.println("ice");
        } else {
            System.out.println("water");   
        }
    }
}