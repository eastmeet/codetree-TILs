import java.util.*;



public class Main {

    private static final Map<Integer, String> adult = new HashMap<>();
    private static final Map<Integer, String> young = new HashMap<>();

    static {
        adult.put(0, "MAN");
        adult.put(1, "WOMAN");
        young.put(0, "BOY");
        young.put(1, "GIRL");
    }

    public static void main(String[] args) {

        // 여기에 코드를 작성해주세요.
        try (Scanner sc = new Scanner(System.in)) {
            int sex = sc.nextInt();
            int age = sc.nextInt();
            String result = getResult(sex, age);
            System.out.println(result);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static String getResult(int sex, int age) {
        Map<Integer, String> map = (age >= 19) ? adult : young;
        return map.getOrDefault(sex, "UNKNOWN");
    }
}