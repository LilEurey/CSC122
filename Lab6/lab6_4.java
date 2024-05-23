package CSC122.Lab6;

import java.util.Scanner;

public class lab6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int rc = sc.nextInt();
            int cc = sc.nextInt();
            arr[rc][cc] += 1;
            if (rc != 0) {
                arr[rc - 1][cc] += 1; // up
            }
            //  if(rc !=0 || cc!=col-1){ //up right
            //     arr[rc-1][cc+1] +=1;
            //  }
            if (cc != col - 1) { // right
                arr[rc][cc + 1] += 1;
            }
            if (rc != row - 1) { // bottom
                arr[rc + 1][cc] += 1;
            }
            if (cc != 0) {
                arr[rc][cc - 1] += 1; //left
            }
            // if (rc == row - 1 && cc == 0) {
            // arr[rc][cc + 1] += 1;
            // arr[rc - 1][cc] += 1;
            // } else if (rc == 0 && cc == col - 1) {
            // arr[rc][cc - 1] += 1;
            // arr[rc + 1][cc] += 1;
            // } else if (rc == 0 && cc == 0) {
            // arr[rc][cc + 1] += 1;
            // arr[rc + 1][cc] += 1;
            // } else if (rc == row - 1 && cc == col - 1) {
            // arr[rc][cc - 1] += 1;
            // arr[rc - 1][cc] += 1;
            // } else if (rc == 0 && cc != 0) {
            // arr[rc][cc - 1] += 1;
            // arr[rc][cc + 1] += 1;
            // arr[rc + 1][cc] += 1;
            // } else if (rc != 0 && cc == 0) {
            // arr[rc][cc + 1] += 1;
            // arr[rc - 1][cc] += 1;
            // arr[rc + 1][cc] += 1;
            // } else if (rc == row - 1 && cc != col - 1) {
            // arr[rc][cc - 1] += 1;
            // arr[rc][cc + 1] += 1;
            // arr[rc - 1][cc] += 1;
            // } else if (rc != row - 1 && cc == col - 1) {
            // arr[rc][cc - 1] += 1;
            // arr[rc - 1][cc] += 1;
            // arr[rc + 1][cc] += 1;
            // }
            // else {
            // arr[rc][cc+1] += 1;
            // arr[rc][cc - 1] += 1;
            // arr[rc - 1][cc] += 1;
            // arr[rc + 1][cc] += 1;
            // }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
