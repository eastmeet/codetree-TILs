import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr =IntStream.range(0, 10)
                .map(i -> sc.nextInt())
                .toArray();

        IntSummaryStatistics evenStats = Arrays.stream(arr)
            .filter(n -> n % 2 == 0)
            .summaryStatistics();

        IntSummaryStatistics multipleOfThreeStats = Arrays.stream(arr)
            .filter(n -> n % 3 == 0)
            .summaryStatistics();

        long evneSum = evenStats.getSum();
        double sum = multipleOfThreeStats.getAverage();
        System.out.println(evneSum + " " + sum);
    }
}