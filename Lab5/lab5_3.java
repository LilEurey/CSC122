package CSC122.Lab5;

import java.util.Scanner;

public class lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        int swa = a;
        int swb = b;
        if (c == '1') {
            swa = 1-swa;
        }
        if (d == '1') {
            swb = 1-swb;
        }
        if (swa == 1 && swb == 0) {
            System.out.println("MuR");
        } else if (swa == 0 && swb == 0) {
            System.out.println("NEUTRAL");
        } else if (swa == 0 && swb == 1) {
            System.out.println("DnD");
        }
    }
}
