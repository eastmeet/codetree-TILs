import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            boolean result = isLeapYear(year);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } 
        return false;
    }
}