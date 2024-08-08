import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            // a ~ b 범위 사이 소수 구해서 그것의 합
            List<Integer> list = getPrimeList(a, b);
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static List<Integer> getPrimeList(int a, int b) {

        List<Integer> result = new ArrayList();

        for (int i = a; i <= b; i++) {

            if (isPrime(i)) {
                result.add(i);
            }
        }

        return  result;

    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}