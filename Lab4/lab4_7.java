package CSC122.Lab4;

import java.util.Scanner;

public class lab4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int[][][] rubik = new int[5][5][5];
        int count = 0;
        // 1 = black
        // -1=white
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    rubik[i][j][k] = 1;
                }
            }
        }
        for (int i = 1; i <= times; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0) {
                rubik[a][b][c] *= -1;
                rubik[a + 1][b][c] *= -1;
            }
            if (b == 0) {
                rubik[a][b][c] *= -1;
                rubik[a][b + 1][c] *= -1;
            }
            if (c == 0) {
                rubik[a][b][c] *= -1;
                rubik[a][b][c + 1] *= -1;
            }
            if (a == 4) {
                rubik[a][b][c] *= -1;
                rubik[a - 1][b][c] *= -1;
            }
            if (b == 4) {
                rubik[a][b][c] *= -1;
                rubik[a][b - 1][c] *= -1;
            }
            if (c == 4) {
                rubik[a][b][c] *= -1;
                rubik[a][b][c - 1] *= -1;
            }

            if (a > 0 && a<4) {
                rubik[a][b][c] *= -1;
                rubik[a + 1][b][c] *= -1;
                rubik[a - 1][b][c] *= -1;
            }
            if (b > 0 && b<4) {
                rubik[a][b][c] *= -1;
                rubik[a][b + 1][c] *= -1;
                rubik[a][b - 1][c] *= -1;
            }
            if (c > 0 && c<4) {
                rubik[a][b][c] *= -1;
                rubik[a][b][c + 1] *= -1;
                rubik[a][b][c - 1] *= -1;
            }

        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    count += rubik[i][j][k] == -1 ? 1 : 0;
                }
            }
        }
        System.out.println(count);

    }
}
