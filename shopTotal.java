import java.util.*;

public class shopTotal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("price of pen : ");
        float $ = sc.nextFloat();
        System.out.print("\nprice of eraser : ");
        float eraser = sc.nextFloat();
        System.out.print("\nprice of copy : ");
        float copy = sc.nextFloat();
        float Total = copy + eraser + $;
        System.out.print(Total + "\n" );
        float totalWithGST = Total + (Total * (18.0f / 100.0f));
        System.out.println("Total with GST: " + totalWithGST);
        sc.close();
    }
}
