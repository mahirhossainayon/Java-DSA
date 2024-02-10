import java.util.*;
public class reverseSolid {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int rnum = 0;
     while(num!=0){
        rnum = rnum*10 + (num%10);
        num/=10;
     }
     System.out.print(rnum);
     sc.close();
     
    }
}