import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int mul = 1;
   for (int i=1;i<=n;i++){
      mul*=i;
   }
   return mul;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
       int mul = fact(number);
       System.out.print(mul);
       sc.close();
    }
    
    
}
