import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] result = calc(a, b);
        System.out.println(result[0] + " " + result[1]);
        
    }

    private static int[] calc(int a, int b) {
        return (a > b) 
        ? new int[]{a + 25, b * 2} 
        : new int[]{a * 2, b + 25};
    }
}