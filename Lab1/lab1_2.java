package CSC122.Lab1;

import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll(";", " ");
        input.toLowerCase();
        System.out.print(Character.toUpperCase(input.charAt(0)));
        for (int i = 1; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i - 1))) {
                System.out.print(Character.toUpperCase(input.charAt(i)));
            } else {
                System.out.print(input.charAt(i));
            }
        }
    }
}
