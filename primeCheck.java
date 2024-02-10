import java.util.Scanner;

public class primeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;     
            if (n<=1){
                flag = false;
            }
            else if (n==2){
                flag = true;
            }
            else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;  
            }}}
       
        if(flag)

    {
        System.out.println("A prime number");
    }else
    {
        System.out.println("Not a prime number");
    }sc.close();
}}
