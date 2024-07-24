import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try(Scanner sc = new Scanner(System.in);) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
            Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arr1, Collections.reverseOrder());
              for (int i = 0; i < arr.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}