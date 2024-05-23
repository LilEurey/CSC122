package CSC122.BeginnerTutorial;

import java.util.*;

public class Tfb_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.toLowerCase().replaceAll(" ", "");
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        for (char b : arr) {
            System.out.print(b);
        }
    }
}
