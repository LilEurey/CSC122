package CSC122.Lab4;

import java.util.Scanner;

/**
 * lab4_6
 */
public class lab4_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int col1 = sc.nextInt();
        int r2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr1 = new int[r1][col1];
        int[][] arr2 = new int[r2][col2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (r2 == col1) {
            for(int i = 0 ; i<r1;i++){
                for(int j = 0 ; j< col2;j++){
                    int multi = 0 ;
                    for(int k = 0 ; k<r2;k++){
                        multi += arr1[i][k]*arr2[k][j];
                    }
                    System.out.print(multi+" ");
                }
            }
        } else {
            System.out.println("Invalid");
        }
    }
}