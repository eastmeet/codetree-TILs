import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            print(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void print(int n) {
        int i = 0;
        while (i < n) {
            System.out.println("12345^&*()_");
            i++;
        }
    }

}