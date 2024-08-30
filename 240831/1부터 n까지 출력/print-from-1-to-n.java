import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            
        IntStream.rangeClosed(1, a)
                     .forEach(i -> System.out.print(i + " "));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}