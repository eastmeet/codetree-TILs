import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        Result result = Solution.solve(a, b);
        System.out.println(result.a + " " + result.b);
    }
}
class Result {
    int a;
    int b;

    Result(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Solution {
    public static Result solve(int a, int b) {
        if (a < b) {
            a += 10;
            b *= 2;
        } else if (a > b) {
            a *= 2;
            b += 10;
        }
        return new Result(a, b);
    }
}