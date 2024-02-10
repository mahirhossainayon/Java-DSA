import java.util.Scanner;

public class subarraysumKadane {

    public static void kedanes(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            if (ms < cs) {
                ms = cs;
            }
        }

        System.out.println(ms);
        if (ms == 0) {
            ms = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                ms=Math.max(ms,arr[i]);
            }
        }
        System.out.println(ms);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        kedanes(arr);
        sc.close();

    }
}
