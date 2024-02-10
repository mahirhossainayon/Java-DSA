import java.util.Scanner;

public class incomeTax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;

        if (income > 0 && income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = income * (10f / 100f);
        } else if (income > 1000000 && income < 1500000) {
            tax = income * (20f / 100f);
        } else {
            // Handle the case when none of the conditions are met
            tax = 0;
        }

        System.out.print("Income Tax: " + tax);
        sc.close();
    }
}
