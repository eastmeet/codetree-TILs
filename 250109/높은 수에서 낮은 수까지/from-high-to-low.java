import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                printFromBigToSmall(a, b);
            } else {
                printFromBigToSmall(b, a);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printFromBigToSmall(int big, int small) {
        if (small > big) {
            return;
        }

        for (int i = big; i >= small; i--) {
            System.out.print(i + " ");
        }
    }
}