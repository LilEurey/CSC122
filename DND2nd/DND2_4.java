package CSC122.DND2nd;
import java.util.*;
public class DND2_4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int cr = sc.nextInt();
        int cl = sc.nextInt();
        if(arr[cr][cl] == 1){
            arr[cr][cl] = 0;
        } else{
            arr[cr][cl] = 1;
        }
        
        if(cr!=0){ // top
            if(arr[cr-1][cl] == 1){
            arr[cr-1][cl] = 0;
            } else{
            arr[cr-1][cl] = 1;
            }
        }
        
        if(cr!= row-1){ // bottom
            if(arr[cr+1][cl] == 1){
            arr[cr+1][cl] = 0;
            } else{
            arr[cr+1][cl] = 1;
            }
        }
        
        if(cl!=0){ // left
            if(arr[cr][cl-1] == 1){
            arr[cr][cl-1] = 0;
            } else{
            arr[cr][cl-1] = 1;
            }
        }
        
        if(cl != col-1){ // right
            if(arr[cr][cl+1] == 1){
            arr[cr][cl+1] = 0;
            } else{
                arr[cr][cl+1] = 1;
            }
        }
        
        for(int i = 0 ;i<row ; i++){
            for(int j = 0 ; j<col ;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
}
