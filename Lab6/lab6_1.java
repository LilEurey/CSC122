package CSC122.Lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String in = sc.nextLine();
        String[] arr = in.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            String use = sb.toString().toLowerCase();
            String s1 = use.substring(0, 1).toUpperCase();
            String s2 = use.substring(1);
            System.out.print(s1 + s2 + " ");

        }

    }

}