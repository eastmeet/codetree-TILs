import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int month = sc.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Error");
                return;
            }

            String season = "";

            if (month <= 2 || month == 12) {
                season = "Winter";
            } else if (month <= 5) {
                season = "Spring";
            } else if (month <= 8) {
                season = "Summer";
            } else if (month <= 11) {
                season = "Fall";
            }
              
            System.out.println(season);  

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}