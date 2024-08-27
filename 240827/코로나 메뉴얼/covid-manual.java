import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            while(sc.hasNext()) {
                String symptom = sc.next();
                int bodyTemp = sc.nextInt();

                if (symptom.equals("Y") && bodyTemp >= 37){
                    count++;
                }

            }

            if (count >= 2) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}