package CSC122.DND2nd;

import java.util.*;

public class DND2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        int[] arr1 = new int[9];

        for (int i = 0; i < 9; i++) {
            arr1[i] = Character.getNumericValue(arr[i]);
        }
        if (arr[9 / 2] % 2 == 0) {
            for (int i = 0; i < 9; i += 2) {
                ans += arr1[i];
            }
        } else {
            for (int i = 1; i < 9; i += 2) {
                ans += arr1[i];
            }
        }
        System.out.println(ans);
    }
}
