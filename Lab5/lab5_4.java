package CSC122.Lab5;

import java.util.Scanner;

public class lab5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int drow = sc.nextInt();
        int dcol = sc.nextInt();
        int[][] arr = new int[row][col];
        int[][] arr1 = new int[row - 1][col - 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowc = 0;
        int colc = 0;
        for (int i = 0; i < row; i++) {
            if (i == drow) {
                continue;
            } else {
                for (int j = 0; j < col; j++) {
                    if (j == dcol) {
                        continue;
                    } else {
                        if (colc == col-1) {
                            colc = 0 ; rowc++;
                            arr1[rowc][colc] = arr[i][j];
                            colc++;

                        } else {
                            arr1[rowc][colc] = arr[i][j];
                            colc++;

                        }
                    }

                }
            }
        }
        for(int i = 0 ;i<col-1;i++){
            for(int j = 0;j<row-1;j++){
                System.out.print(arr1[j][i]+" ");
            }
        }
        
    }
}
