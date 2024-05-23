package CSC122.Lab2;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < in.length() - 2; i++) {
            if (in.charAt(i) == 'c') {
                if (in.charAt(i + 1) == 'a' && in.charAt(i + 2) == 't') {
                    cat++;
                }
            } else if (in.charAt(i) == 'd') {
                if (in.charAt(i + 1) == 'o' && in.charAt(i + 2) == 'g') {
                    dog++;
                }
            }
        }
        if (cat == dog) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String in = sc.nextLine();
// int cat = 0;
// int dog = 0;
// for (int i = 0; i < in.length()-2; i++) {
// if (in.charAt(i) == 'c' && in.charAt(i + 1) == 'a' && in.charAt(i + 2) ==
// 't') {
// cat++;
// }
// else if (in.charAt(i) == 'd'&& in.charAt(i + 1) == 'o' && in.charAt(i + 2) ==
// 'g') {
// dog++;

// }
// }
// if (cat == dog) {
// System.out.println("true");
// } else {
// System.out.println("false");
// }
// }
// }
