import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int cnt = 0;
            for (int i = a; i <= b; i++) {
                if (isCondition(i)) {
                    cnt++;
                }
            }
        System.out.println(cnt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static boolean isCondition(int i) {
        return i % 3 == 0 || isThreeSixNine(i);
    }

    public static boolean isThreeSixNine(int i) {
        /* string solve 
        String str = String.valueOf(i);
        if (str.contains("3") || str.contains("6") || str.contains("9")) {
            return true;
        } else {
            return false;
        }
        */
        while (i > 0) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)  {
                return true;
            }

            i /= 10;
        }
        return false;
        }
}