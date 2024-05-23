package CSC122.Lab3;

import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iron = sc.nextInt();
        int sw = 0;
        int sh = 0;
        int hel = 0;
        while (iron >= 21) {
            iron -= 21;
            sw++;
            sh++;
            hel++;
        }
        while (iron >= 10) {
            iron -= 10;
            sw++;
        }
        while (iron >= 8) {
            iron -= 8;
            sh++;
        }
        while (iron >= 3) {
            iron -= 3;
            hel++;
        }

        System.out.println(sw + " " + sh + " " + hel + " " + iron);

    }
}
