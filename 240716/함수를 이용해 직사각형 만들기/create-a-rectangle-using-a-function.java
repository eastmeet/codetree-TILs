import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try(Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            printRect(n, m);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void printRect(int n, int m) {

        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }

            

    }
}