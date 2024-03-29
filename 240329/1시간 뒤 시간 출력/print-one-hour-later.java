import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.next();
        String[] timeParts = currentTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int min = Integer.parseInt(timeParts[1]);
        
        hours = hours + 1 % 24; 
        System.out.printf("%d:%d", hours, min);
    }
}