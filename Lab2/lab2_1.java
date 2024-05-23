package CSC122.Lab2;

import java.util.Scanner;
import java.util.Arrays;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().toLowerCase().replaceAll(" ", "");

        char[] arr = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            arr[i] = in.charAt(i);
        }
        Arrays.sort(arr);
        for (char a : arr) {
            System.out.print(a);
        }
    }
}
