import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("-");
        System.out.println(arr[0] + "-" + arr[2] + "-" + arr[1]);
    }
}