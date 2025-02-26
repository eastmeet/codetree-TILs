import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        String[] strArr = input.split("");
        String result = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
             result += strArr[i];
        }

        System.out.println(input.equals(result) ? "Yes" : "No");
    }
}