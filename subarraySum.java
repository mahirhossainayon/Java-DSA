import java.util.Scanner;

public class subarraySum {
    public static void subarrSum(int arr[]) {
        int  maxSum =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0 ;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
                System.out.println();
                System.out.println(sum);
            }
        }
        System.out.println(maxSum);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int arr[]= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        subarrSum(arr);
    }
}
