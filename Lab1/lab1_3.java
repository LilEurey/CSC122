package CSC122.Lab1;

import java.util.Scanner;

public class lab1_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ope = sc.next().charAt(0);
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        switch (ope) {
            case '+':
                System.out.println(add);
                break;
            case '-':
                System.out.println(sub);
                break;
            case '*':
                System.out.println(mul);
                break;
            case '/':
                System.out.println(div);
        }

    }
}
