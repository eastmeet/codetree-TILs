import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        try (Scanner sc = new Scanner(System.in);) {
            String ucLetter = sc.nextLine();

            if (ucLetter.equals("S")){
                System.out.println("Superor");
            } else if (ucLetter.equals("A")) {
                System.out.println("Excellent");
            } else if (ucLetter.equals("B")) {
                System.out.println("Good");
            } else if (ucLetter.equals("C")) {
                System.out.println("Usually");
            } else if (ucLetter.equals("D")) {
                System.out.println("Effor");
            } else {
                System.out.println("Failure");
            }
        }


    }
}