import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        boolean judge = judge(A);
        System.out.println(judge ? "Yes" : "No");
    }

    private static boolean judge(String A) {
        if (A.length() < 2) {
            return false;
        }

        Set<Character> set = new HashSet<>();
        for (char c : A.toCharArray()) {
            set.add(c);
            if (set.size() >= 2) {
                return true;
            }
        }
        return false;
    }

    
}