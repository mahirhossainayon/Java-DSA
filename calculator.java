import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char oparator = sc.nextLine().charAt(0);
    int a = sc.nextInt();
    int b = sc.nextInt();
    switch (oparator){
        case '+' : System.out.print (a + b) ;
        break;
        case '-' : System.out.print (a - b) ;
        break;
        case '*' : System.out.print (a * b) ;
        break;
        
        case '/' :if (b>0){ System.out.print (a / b) ;}
                  else{System.out.print ("b can not be less than or equal to zero");}
        break;
        case '%' : if (b>0){ System.out.print (a / b) ;}
                   else{System.out.print ("b can not be less than or equal to zero");}
        default : System.out.print ("invalid oparator");
    }
  sc.close();
    }
}
