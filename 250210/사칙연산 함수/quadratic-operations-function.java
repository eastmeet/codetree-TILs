import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        String result = calculate(a, o, c);
        if (result.equals("False")) {
            System.out.println("False");
            return;
        } 
        
        System.out.println(a + " " + o + " " + c + " = " + result);
    }

    private static String calculate(int a, String o, int c) {
        switch (o) {
            case "+":
                return String.valueOf(a + c);
            case "-":
                return String.valueOf(a - c);
            case "*":
                return String.valueOf(a * c);
            case "/":
                return String.valueOf(a / c);
            default:
                return "False";
        }
    }
}