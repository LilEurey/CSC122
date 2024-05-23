package CSC122.Lab1;

import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String first;
        String sec;
        if (input.equals("A")) {
            first = "A";
            sec = "B";
        } else {
            first = "B";
            sec = "A";
        }
        int cola = sc.nextInt();
        int add = 2;
        int use = 0;
        int round;
        for (round = 1; round < cola; round++) {
            if (round * add >= cola) {
                use = round * add;
                break;
            }
            add++;
        }
        if (use == cola) {
            System.out.println(sec);
        } else {
            int diff = use - cola;
            if (diff >= round) {
                System.out.println(first);
            } else {
                System.out.println(sec);
            }
        }
    }
}
