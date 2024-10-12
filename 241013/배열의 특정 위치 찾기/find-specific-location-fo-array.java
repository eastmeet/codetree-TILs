import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr =IntStream.range(0, 10)
                .map(i -> sc.nextInt())
                .toArray();

        IntSummaryStatistics evenStats = IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 1)
                .map(i -> arr[i])
                .summaryStatistics();

        IntSummaryStatistics multipleOfThreeStats = IntStream.range(0, arr.length)
                .filter(i -> (i + 1) % 3 == 0)
                .map(i -> arr[i])
                .summaryStatistics();

        long sum = evenStats.getSum();
        double avg = multipleOfThreeStats.getAverage();
        System.out.println(sum + " " + String.format("%.1f", avg));
    }
}