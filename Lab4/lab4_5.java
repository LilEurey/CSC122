package CSC122.Lab4;

import java.util.Scanner;

public class lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int col = sc.nextInt();
        double [][] arr  =new double [r][col];
        for(int i = 0 ; i<r;i++){
            for(int j = 0 ; j<col;j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        //row average
        System.out.println("Average of each row:");
        for(int i = 0 ; i<r;i++){
            double sum = 0 ;
            for(int j = 0 ; j<col;j++){
                sum+=arr[i][j];
            }
            System.out.print(sum/col+" ");
        }
        System.out.println();
        //col average
        System.out.println("Average of each column:");
        for(int i = 0 ; i<col;i++){
            double sum = 0 ;
            for(int j = 0 ; j<r;j++){
                sum+=arr[j][i];
            }
            System.out.print(sum/r+" ");
        }
    }
}
