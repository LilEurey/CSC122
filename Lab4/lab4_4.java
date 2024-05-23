package CSC122.Lab4;

import java.util.Scanner;

public class lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int [] arr = new int[s];
        for(int i = 0 ; i < s ;i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        for(int i =0 ; i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] =c;
        }
        for(int i = 0 ; i < s ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
