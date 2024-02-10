import java.util.Scanner;

public class palindrome {
    public static boolean numRev(int n) {
        int r = 0;
        int temp = n;
        while (n != 0) {
            r = r * 10 + (n % 10);
            n /= 10;
        }
        if (temp == r) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (numRev(num)) {
            System.out.print("It's a palindrome number");
        } else {
            System.out.print("It's not a palindrome number");
        }
        sc.close();
    }
}
