import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            Integer mathA = sc.nextInt();
            Integer engA = sc.nextInt();
            Integer mathB = sc.nextInt();
            Integer engB = sc.nextInt();

            String result = compareStudentScore(mathA, engA, mathB,engB);
            System.out.println(result);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static String compareStudentScore(Integer mathA, Integer engA, Integer mathB, Integer engB) { 
           int mathComparison = mathA.compareTo(mathB);
           if (mathComparison != 0) {
               return mathComparison > 0 ? "A" : "B"; 
           }
           return engA.compareTo(engB) >= 0 ? "A" : "B";
        }
}