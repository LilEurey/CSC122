package CSC122.BeginnerTutorial;

import java.util.Scanner;

public class Tfb_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equalsIgnoreCase(b)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
