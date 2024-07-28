import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            List<Integer> list = Arrays.asList(a, b, c);
            int x = getMinValue(list);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
    // 확장성이 있는 코드이려면? 묶음으로 받는다
    public static int getMinValue(List<Integer> list) {
        return list.stream().min(Integer::compareTo).orElseThrow(
                () -> new RuntimeException("list is empty")
        ).intValue();
    }
}