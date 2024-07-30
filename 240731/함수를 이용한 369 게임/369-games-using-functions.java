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
        String str = String.valueOf(i);
        if (str.contains("3") || str.contains("6") || str.contains("9")) {
            return true;
        } else {
            return false;
        }
        // 3, 6, 9 숫자가 하나 있는지 판별
        // String으로 변환하기?
        // 다른 수학적 지식 => 각자리를 검증해야한다.
        // 반복문? 그럴려면 i가 몇자리의 수 인지 검증
        // 일의자리 부터 시작
        // int n = 10;
        // while (i % n != i) {
            // if (i % n == 3 || i % n == 6 || i % n == 9) {
                // return true;
            }
            // n *= 10;
        // }
        
    }