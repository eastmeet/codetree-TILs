import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            String o = sc.next();
            int c = sc.nextInt();

            String result = calculate(a, o.charAt(0), c);
            if (result.equals("False")) {
                System.out.println("False");
                return;
            }
            System.out.println(a + " " + o + " " + c + " = " + result);
        } catch (ArithmeticException e) {
                System.out.println("False");
        }
    }

    private static String calculate(int a, char operator, int c) {         
        try {
            int result;
            switch (operator) {
                case '+':
                    result = a + c;
                    break;
                case '-':
                    result = a - c;
                    break;
                case '*':
                    result = a * c;
                    break;
                case '/':
                    if (c == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result = a / c;
                    break;
                default:
                    return "False";
            } 
            return String.valueOf(result);
            } catch (Exception e) {
                return "False";
            }
    }
}