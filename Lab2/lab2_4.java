package CSC122.Lab2;

import java.util.Scanner;

public class lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min = sc.nextInt();
        String t = sc.next();
        if (t.equals("am") && hr == 12) {
            hr -= 12;
        } else if (t.equals("pm") && hr == 12) {
            hr = hr;
        } else if (t.equals("pm")) {
            hr += 12;
        }
        System.out.printf("%02d", hr);
        System.out.print(":");
        System.out.printf("%02d", min);
    }
}
