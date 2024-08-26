import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {

            List<Integer> numbers = new ArrayList();

            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }

            if (numbers.isEmpty()) {
                System.out.println("입력한 수 없음");
            }

            int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
            System.out.println(max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}