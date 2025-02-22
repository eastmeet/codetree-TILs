import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 온전수 조건 2로 나누어떨어진다 => x % 2 != 0 and
        // x / 10 != 5;  
        // x % 3 != 0 and x % 9 != 0

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;
        
        for(int i = x; i <= y; i++) {
            boolean flag = isTargetNumber(i);
            if (flag) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean isTargetNumber(int z) {

        if (z % 2 == 0) {
            return false;
        } 

        if (z % 10 == 5) {
            return false;
        }

        if (z % 3 == 0 & z % 9 != 0) {
            return false;
        }

        return true;
    }

}