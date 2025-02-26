import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        System.out.println(input.equals(result) ? "Yes" : "No");
    }
}