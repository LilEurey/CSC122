package CSC122.Lab4;

import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[r][col];
        for(int i = 0 ;i<r;i++){
            for(int j = 0 ; j<col ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ;i<r;i++){
            int sum = 0;
            for(int j = 0 ; j<col ;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum of row#"+i+" is "+sum);
        }
    }
}
