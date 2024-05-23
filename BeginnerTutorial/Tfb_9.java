package CSC122.BeginnerTutorial;

import java.util.Scanner;

public class Tfb_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.reverse().toString());
    }
}
