import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            IntStream.rangeClosed(a,b)
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}