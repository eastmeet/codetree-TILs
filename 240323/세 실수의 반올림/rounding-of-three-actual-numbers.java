import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double a1= roundToThreeDecimalPlaces(a);
        double b1= roundToThreeDecimalPlaces(b);
        double c1= roundToThreeDecimalPlaces(c);
        System.out.printf("%.3f\n", a1);
        System.out.printf("%.3f\n", b1);
        System.out.printf("%.3f\n", c1);
    }

    public static double roundToThreeDecimalPlaces(double value) {
        return Math.round(value * 1000) / 1000.0;
    }
}