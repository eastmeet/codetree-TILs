import java.util.*;

public class Main {

    private static Map<Integer, Integer> callender = new HashMap();

    static {
        callender.put(1, 31);
        callender.put(2, 28);
        callender.put(3, 31);
        callender.put(4, 30);
        callender.put(5, 31);
        callender.put(6, 30);
        callender.put(7, 31);
        callender.put(8, 31);
        callender.put(9, 30);
        callender.put(10, 31);
        callender.put(11, 30);
        callender.put(12, 31);
    }

    public static void main(String[] args) {
       // 여기에 코드를 작성해주세요.
       try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();
            int result = callender.getOrDefault(month, -1);
            System.out.println(result);
       } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
       }

    }
}