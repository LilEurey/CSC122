package CSC122.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        ArrayList<String> keepS = new ArrayList<>();
        ArrayList<Integer> keepI = new ArrayList<>();
        while (i >= 0) {
            String a = sc.nextLine();
            if (a.equals("end"))
                break;
            else {
                String[] arr = a.split(",");
                int b = Integer.parseInt(arr[1]);
                keepS.add(arr[0]);
                keepI.add(b);

            }
            i++;

        }
        for (int j = keepS.size() - 1; j >= 0; j--) {
            for (int k = j - 1; k >= 0; k--) {
                if (keepS.get(j).equals(keepS.get(k))) {
                    keepI.set(j, keepI.get(j) + keepI.get(k));
                    keepI.remove(k);
                    keepS.remove(k);
                    break;
                }
            }
        }
        
        int ans = 0;
        String anw ="";
        for(int j = 0 ;j<keepS.size();j++){
            if(keepI.get(j)>ans){
                ans = keepI.get(j);
                anw = keepS.get(j);
            }
       }
       System.out.println(anw+","+ans);


    }

}