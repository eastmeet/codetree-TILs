import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int AMath = sc.nextInt();
            int AEng = sc.nextInt();
            int BMath = sc.nextInt();
            int BEng = sc.nextInt();


            if (AMath > BMath && AEng > BEng) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}