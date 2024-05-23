package CSC122.BeginnerTutorial;

import java.util.Scanner;

public class Tfb_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int le = sc.nextInt();
        int[] arr = new int[le];
        for (int i = 0; i < le; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = arr[b];
            arr[b] = arr[c];
            arr[c] = d;
        }
        for (int i = 0; i < le; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
