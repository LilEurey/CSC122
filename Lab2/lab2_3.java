package CSC122.Lab2;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<a.length() || i<b.length();i++){
            if(i<a.length()){
                sb.append(a.charAt(i));
            }
            if((i<b.length())){
                sb.append(b.charAt(b.length()-1-i));
            }
        }
        System.out.println(sb.toString());
    //     if (a.length() > b.length()) {
    //         for (int i = 0; i < a.length(); i++) {
    //             if (b.length() - i - 1 >= 0) {
    //                 System.out.print(a.charAt(i));
    //                 System.out.print(b.charAt(b.length() - i - 1));
    //             } else {
    //                 System.out.print(a.charAt(i));
    //             }
    //         }
    //     } else if (b.length() > a.length()) {
    //         for (int i = 0; i < b.length(); i++) {
    //             if (i <= a.length() - 1) {
    //                 System.out.print(a.charAt(i));
    //                 System.out.print(b.charAt(b.length() - i - 1));
    //             } else {
    //                 System.out.print(b.charAt(b.length() - 1 - i));
    //             }
    //         }
    //     } else if (a.length() == b.length()) {
    //         for (int i = 0; i < a.length(); i++) {
    //             System.out.print(a.charAt(i));
    //             System.out.print(b.charAt(b.length() - i - 1));
    //         }

    //     }
    }
}
