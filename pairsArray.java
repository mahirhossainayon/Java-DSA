import java.util.Scanner;

public class pairsArray {
    public static void pairArr(int arr[]) {
        int tp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("(" + arr[i] + "," + arr[j]+ ")");
                tp++;
            }
        }
        System.out.println(tp);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pairArr(arr);
        sc.close();
    }
}
