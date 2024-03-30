import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputArr = input.split("-");
        String mm = inputArr[0];
        String dd = inputArr[1];
        String yyyy = inputArr[2];
        System.out.println(yyyy + "." + mm + "." + dd);
    }
}