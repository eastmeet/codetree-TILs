public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        for (int i = 0; i < 5; i++) {
            printStart(10);
        }
    }

    public static void printStart(int count) {
        int i = 0;
        while(i < count) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}