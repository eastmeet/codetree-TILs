import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 중앙값 구하기
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = getMedian(a,b,c);
            System.out.println(result);
        }
    }

    public static int getMedian(int a, int b, int c) {
        // if ((b >= a && a >= c) || (c >= a && a >= b) ) {
        //     return a;
        // } else if ((c >= b && b >= a) || (a >= b && b >= c)) {
        //     return b;
        // } else {
        //     return c;
        // }

        return IntStream.of(a, b, c)
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt();
    }
}