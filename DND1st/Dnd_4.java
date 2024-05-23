package CSC122.DND1st;

import java.util.*;

public class Dnd_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int time = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 1; i <= time; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (arr[j][k] >= 1) {
                        arr[j][k] += 5;
                    }
                }
            }

            if (i > 1 && i <= time) {
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        if (arr[j][k] >= 5) {
                            if (j - 1 >= 0) {
                                arr[j - 1][k] += 1;
                            }
                            if (j + 1 < row) {
                                arr[j + 1][k] += 1;
                            }
                            if (k - 1 >= 0) {
                                arr[j][k - 1] += 1;
                            }
                            if (k + 1 < col) {
                                arr[j][k + 1] += 1;
                            }
                        }
                    }
                }
            }
            int r1 = sc.nextInt();
            int col1 = sc.nextInt();
            arr[r1][col1] += 1;

        }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] >= 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}