import java.util.Scanner;

public class onetotenwhile {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  int a = 0;
  while (a<n){
    System.out.println(++a);
  } 
  sc.close();
    }
}