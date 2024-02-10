import java.util.Scanner;

public class linearSearch {

    public static int lSearch(int arr[], int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int find = 99;
        int flag = lSearch(arr, find);
        if (flag == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(flag);
        }
        sc.close();
    }
}