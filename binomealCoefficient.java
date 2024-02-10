import java.util.Scanner;

public class binomealCoefficient {
    public static int factorial(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public static int bico(int n, int r) {
        int x, y, z;
        x = factorial(n);
        y = factorial(r);
        z = factorial(n - r);
        return x / (y * z);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        System.out.print(bico(n, r));
        sc.close();
    }
}
