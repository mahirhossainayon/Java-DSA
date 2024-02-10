import java.util.Scanner;

public class productAB {
    public static int product(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int A = sc.nextInt();
        System.out.print("\n" + "Enter B = ");
        int B = sc.nextInt();
        int multiply = product(A, B);
        System.out.print(multiply);
        sc.close();
    }
}