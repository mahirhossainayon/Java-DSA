import java.util.Scanner;

public class largestArray {
    public static int largest(int arr[]) {
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }
        return larg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));
        sc.close();
    }
}
