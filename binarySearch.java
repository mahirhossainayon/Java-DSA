import java.util.*;

public class binarySearch {
    public static int binSearch(int arr[], int key) {
        int start = 0, end = arr.length - 1, mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = 10;
        System.out.println("index is : "+binSearch(arr, key));
        sc.close();
    }
}