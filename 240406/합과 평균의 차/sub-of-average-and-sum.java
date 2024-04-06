import java.util.*;

public class Main {

    private static final int NUMBER_OF_INPUTS = 3;
    private static final int MIN = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {
        
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();
        
        while(numbers.size() < NUMBER_OF_INPUTS) {
            try {
                int num = sc.nextInt();
                if (num >= MIN && num <= MAX) {
                    numbers.add(num);
                } else {
                    System.out.println("입력된 정수는" + MIN + "과" + MAX + "사이입니다.");
                }   
            } catch(InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
                sc.next();
            }
        }
        
        sc.close();

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int avg = sum / numbers.size();
        int result = sum - avg;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(result);
    }
}