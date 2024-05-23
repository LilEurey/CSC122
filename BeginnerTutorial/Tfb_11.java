package CSC122.BeginnerTutorial;

import java.util.Scanner;

/**
 * Tfb_11
 */
public class Tfb_11 {
    public static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        re(a);
        System.out.println(ans);
    }

    public static void re(int a) {
        if (a > 0) {
            ans += a % 10;
            a /= 10;
            re(a);
        }

    }

}