package CSC122.Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        for(int i = 0 ; i<s;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
