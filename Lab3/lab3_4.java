package CSC122.Lab3;

import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double tolerance = sc.nextDouble();
        double result = 0;
        while ((b - a) > tolerance) {
            double xns = (a + b) / 2;
            if (fx(a, c1, c2) * fx(xns, c1, c2) < 0) {
                b = xns;
            } else if (fx(a, c1, c2) * fx(xns, c1, c2) > 0) {
                a = xns;
            }
            result = xns;
        }
        System.out.println(result);

    }

    public static double fx(double a, double c1, double c2) {
        return c1 + c2 * (a - Math.sin(a));
    }
}
