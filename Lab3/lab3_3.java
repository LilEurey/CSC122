package CSC122.Lab3;

import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().toUpperCase();
        char[] arr = new char[in.length()];
        arr = in.toCharArray();
        int A = (int) 'A';
        for (int i = A; i <= (int) 'Z'; i++) {
            boolean check = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    check = true;
                }

            }
            if (check == true) {
                System.out.print((char) i + " ");
            }
        }
    }
}
