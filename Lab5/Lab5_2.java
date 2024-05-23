package CSC122.Lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        double v [] = new double[am];
        double check [] = new double[am];
        for(int i = 0 ; i < am ;i++){
            int id = sc.nextInt();
            double d = sc.nextDouble();
            double m = sc.nextDouble();
            double volume = Math.PI * Math.pow(d/2, 2)*m;
            v[i] = volume;
            check[i]=volume;
        }
        Arrays.sort(v);
        for(int i = 0 ;i<am;i++){
            for(int j = 0 ;j<am;j++){
                if(v[i]==check[j]){
                    System.out.print(j+1+" ");
                    break;
                }
            }
        }

    }
}
