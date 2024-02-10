import java.util.Scanner;

public class decimalTObinary {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int dec = sc.nextInt();
  int bin = 0,pos=0;
  while(dec!=0){
     bin = bin + (dec%2)*(int)Math.pow(10, pos);
     dec/=2;
     pos++;
  }
   System.out.println(bin);
   sc.close();
    }
}
