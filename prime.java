import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= n; i++) {
            flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                System.out.print(i + "  ");
            }
        }
        sc.close();
    }
}
