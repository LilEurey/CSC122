package CSC122.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double[] arr = new double[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        if (a % 2 != 0) {
            double sw = arr[0];
            arr[0] = arr[(a / 2)-1];
            arr[(a / 2)-1] = sw;
            double sw1 = arr[a-1];
            arr[a-1] = arr[(a / 2)+1];
            arr[(a / 2)+1] = sw1;

        } else {
            double sw = arr[0];
            arr[0] = arr[(a / 2)-1];
            arr[(a / 2)-1] = sw;
            double sw1 = arr[a-1];
            arr[a-1] = arr[a / 2];
            arr[a / 2] = sw1;
        }
        for(int i = 0 ; i<a;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
