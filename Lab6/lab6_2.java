package CSC122.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        if (a % 2 == 0) {
            System.out.println(arr[(a / 2) - 1] + " " + arr[a / 2]);
        } else {

            System.out.println(arr[a / 2]);
        }
    }
}
