import java.util.Scanner;

public class binTOdecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int a = 0, sum = 0;
        while (bin != 0) {
            int x = bin % 10;
            int y = (int) Math.pow(2, a);
            int z = x * y;
            sum += z;
            a++;
            bin = bin / 10;
        }
        System.out.print(sum);
        sc.close();
    }
}
