import java.util.Scanner;

public class primeNumber {
    public static boolean prime(int n) {
        if (n<=1){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
         if(n%i==0){
            return true;
         }
        }
        return false;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     boolean x = prime(num);
  if (x){
     System.out.print("Not a prime number");
  }
  else{
    System.out.print("A prime number");
}
    sc.close();
     }
}
