import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String StrA = sc.nextLine();
        String StrB = sc.nextLine();
        sc.close();
        int a = Integer.parseInt(StrA);
        int b = Integer.parseInt(StrB);
        System.out.println(a + 87);
        System.out.println(b % 10);
    }
}