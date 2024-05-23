import java.util.*;

public class quiz4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        int count = 0;
        int[] arr = new int[am];
        for (int i = 0; i < am; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < am; i++) {
            if (check(arr[i])) {
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean check(int a) {
        boolean ch = true;
        String b = a + "";
        for (int i = 0; i < b.length(); i++) {
            int count = 0;
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(i) == b.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                ch = false;
            }
        }
        return ch;
    }
}