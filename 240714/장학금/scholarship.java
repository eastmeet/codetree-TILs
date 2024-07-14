import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        try (Scanner sc = new Scanner(System.in);) {
            int midRecrod = sc.nextInt();
            int finalRecord = sc.nextInt();

            String money = "0";

            if (midRecrod < 90) {
                System.out.println(money);
                return;
            }
            
            if (finalRecord >= 95) {
                money = "100000";
            } else if (finalRecord >= 90) {
                money = "50000";
            }

            System.out.println(money);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}