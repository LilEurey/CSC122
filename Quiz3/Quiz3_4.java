package CSC122.Quiz3;

import java.util.*;

public class Quiz3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int To = 0;
        int Le = 0;
        int Straw = 0;
        int[][] arr = new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = 0;
            }
        }

        int a = sc.nextInt();
        int co = 0;
        for (int i = 1; i <= 11; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    if (arr[j][k] == 1024) {
                        To++;
                    } else if (arr[j][k] == 128) {
                        Le++;
                    } else if (arr[j][k] == 49152) {
                        Straw++;
                    }
                    if (arr[j][k] > 0) {
                        arr[j][k] *= 4;
                    }
                }
            }
            if (co < a) {
                int seed = sc.nextInt();
                int row = sc.nextInt();
                int col = sc.nextInt();
                arr[row][col] = seed;
                co++;
                if (row != 0) {
                    arr[row - 1][col] = seed;// top
                }
                if (row != 0 && col != 19) {
                    arr[row - 1][col + 1] = seed;// top r
                }
                if (row != 0 && col != 0) {
                    arr[row - 1][col - 1] = seed;// top l
                }
                if (row != 19) {
                    arr[row + 1][col] = seed;// bot
                }
                if (row != 19 && col != 0) {
                    arr[row + 1][col - 1] = seed;// bot l
                }
                if (row != 19 && col != 19) {
                    arr[row + 1][col + 1] = seed;// bot r
                }
                if (col != 0) {
                    arr[row][col - 1] = seed;// l
                }
                if (col != 19) {
                    arr[row][col + 1] = seed;// r
                }

            }

        }

        System.out.println("Tomato: " + To);
        System.out.println("Leek: " + Le);
        System.out.println("Strawberry: " + Straw);

    }
}