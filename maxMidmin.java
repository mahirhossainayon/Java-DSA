import java.util.Scanner;

public class maxMidmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            if (b > c) {
                System.out.println("max :" + a + "\n" + "mid :" + b + "\n" + "min :" + c);
            } else {
                System.out.println("max :" + a + "\n" + "mid :" + c + "\n" + "min :" + b);
            }

        }
        if (b >= a && b >= c) {
            if (a > c) {
                System.out.println("max :" + b + "\n" + "mid :" + a + "\n" + "min :" + c);
            } else {
                System.out.println("max :" + b + "\n" + "mid :" + c + "\n" + "min :" + a);
            }

        } else {
            if (b > a) {
                System.out.println("max :" + c + "\n" + "mid :" + b + "\n" + "min :" + a);
            } else {
                System.out.println("max :" + c + "\n" + "mid :" + a + "\n" + "min :" + b);
            }

        }

        sc.close();
    }
}
