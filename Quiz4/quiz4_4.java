package CSC122.Quiz4;

import java.util.*;

public class quiz4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MuR = sc.nextInt();
        int DnD = sc.nextInt();
        char c = sc.next().charAt(0);
        char d = sc.next().charAt(0);
        if (c == '1') {
            if (MuR == 0) {
                MuR = 1;
                DnD = 0;
            } else {
                MuR = 0;
            }
        }
        if (d == '1') {
            if (DnD == 0) {
                DnD = 1;
                MuR = 0;
            } else {
                DnD = 0;
            }
        }
        if (MuR == 0 && DnD == 0) {
            System.out.println("NEUTRAL");
        } else if (MuR == 1 && DnD == 0) {
            System.out.println("MuR");
        } else if (DnD == 1 && MuR == 0) {
            System.out.println("DnD");
        }

    }
}