package CSC122.DND2nd;

import java.util.*;

public class DND2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        String ans = "";
        String[] arr = new String[am];
        for (int i = 0; i < am; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < am; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            if (i % 2 == 0) {
                ans += sb.toString().toUpperCase() + " ";
            } else {
                ans += sb.toString().toLowerCase() + " ";
            }
        }

        System.out.println(ans);
    }
}
