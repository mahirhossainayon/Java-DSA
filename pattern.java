public class pattern {
    public static void main(String args[]) {
        for (int i = 0; i <=4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
         for (int i = 4;i>0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 1;i<=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        char ch = 'A';
            for (int i = 1;i<=4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
}
