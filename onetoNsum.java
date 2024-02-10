import java.util.Scanner;

public class onetoNsum {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a = 0,sum = 0;
while (a<=n){
    sum += a;
    a++;
}
System.out.print(sum);
sc.close();
    }  
}
