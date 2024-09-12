import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt();
            boolean result = isLeafYear(y);
            System.out.println(result);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            throw e;
        }
    }

    private static boolean isLeafYear(int y) {
        if (!(y % 4 == 0)) {
            return false;
        }

        if ((y % 100 == 0) && (y % 400 != 0)) {
            return false;
        }
        
        return true;
     }
}