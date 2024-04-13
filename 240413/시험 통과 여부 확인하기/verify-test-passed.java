import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try(Scanner sc = new Scanner(System.in)) {;
            int score = sc.nextInt();

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score");
            }

            if (score >= 80) {
                System.out.println("pass");
            } else {
                System.out.printf("%d more score", 80 - score);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}