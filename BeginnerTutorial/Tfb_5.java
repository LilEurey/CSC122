package CSC122.BeginnerTutorial;

import java.util.Scanner;

public class Tfb_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 && a%7==0){
            if(a>105){
                System.out.println(a%100);
            }
            if(a<-105){
                System.out.println(a%100);
            }
            else{
                System.out.println(a);
            }
        }
       else if(a%3==0){
           System.out.println(a-1);
       }
       else if(a%7==0){
           System.out.println(a+1);
       }
       else{
           System.out.println(2*a-21);
       }
    }
}
