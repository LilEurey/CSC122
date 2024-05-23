package CSC122.BeginnerTutorial;

import java.util.*;

public class Tfb_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int le = sc.nextInt();
        int[] arr = new int[le];
        for (int i = 0; i < le; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < le; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
