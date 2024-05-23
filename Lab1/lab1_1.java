package CSC122.Lab1;

import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double result = ((x + (4.0 * y)) / (x + y)) + ((10.0 * z) / 16.0) - (((1.0 / 5.0) * x) + x * y * z) / 200.0;
        System.out.println(result);
    }
}
