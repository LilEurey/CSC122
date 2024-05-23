package CSC122.Lab3;

import java.util.Scanner;

/**
 * lab3_1
 */
public class lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String sp = " ";
        if (in.length() % 2 == 0) {
            System.out.println("Invalid word input");
        } else {
            for (int i = 0; i < in.length() / 2; i++) {
                System.out.println(sp.repeat(i) + in.charAt(i) + sp.repeat(in.length() - (2 * (i + 1)))
                        + in.charAt(in.length() - 1 - i));
            }
            System.out.println(sp.repeat(in.length() / 2) + in.charAt(in.length() / 2));
            for (int i = in.length() / 2 - 1; i >= 0; i--) {
                System.out.println(sp.repeat(i) + in.charAt(i) + sp.repeat(in.length() - (2 * (i + 1)))
                        + in.charAt(in.length() - 1 - i));

            }
        }
    }
}