package CSC122.Lab4;

import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        double total = 0;
        for(int i =0 ; i < in;i++){
            int a = sc.nextInt();
            total+=a;
        }
        System.out.println(total/in);
    }
    
}
