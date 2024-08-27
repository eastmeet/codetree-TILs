import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) break;  // 빈 줄 입력 시 종료

                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String symptom = parts[0];
                    int bodyTemp = Integer.parseInt(parts[1]);
                    if (symptom.equals("Y") && bodyTemp >= 37) {
                        count++;
                    }
                }
            }
            System.out.println(count >= 2 ? "E" : "N");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}