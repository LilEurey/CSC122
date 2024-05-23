package CSC122.BeginnerTutorial;

import java.util.*;

public class Tfb_14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a); arr.add(b) ; arr.add(c);
        Collections.sort(arr);
        Collections.reverse(arr);
        for(int i = 0 ; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
