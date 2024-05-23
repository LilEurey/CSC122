package CSC122.BeginnerTutorial;

import java.util.Scanner;

public class Tfb_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String even = "";
        String odd = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                even += a.charAt(i);
            } else {
                odd += a.charAt(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
