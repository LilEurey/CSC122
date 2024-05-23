package JAVA.CSC122;

import java.util.Scanner;

public class quiz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String in = sc.nextLine();
        if(in.contains("!")){
            in = in.replaceAll("!+", "!");
        }
        if(in.contains("?")){
            in = in.replace("?", "1");
            in = in.replaceFirst("1", "2");
            in = in.replace("2","?");
            in = in.replace("1", " ");

        }
        System.out.println(in);
    }
}
