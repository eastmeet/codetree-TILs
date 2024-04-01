import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] arr = input.split("-");
        String temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        String result = String.join("-", arr);
        System.out.println(result);
    }
}