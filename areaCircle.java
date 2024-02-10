import java.util.*;
public class areaCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius :");
        float radius = sc.nextFloat();
        float area = radius*2.0f*3.14f;
        System.out.print(area);
        sc.close();
    }
    
}
