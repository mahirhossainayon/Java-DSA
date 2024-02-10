public class funtionOverloading {
    public static int sum (int a, int b){
    return a+b;
    }
     public static int sum (int a, int b,int c){
    return a+b+c;
    }
     public static float sum (float a, float b,float c){
    return a+b+c;
    }
     public static float sum (int a, float b,byte c){
    return a+b+c;
    }
    public static void main(String args[]){
    System.out.print(sum(5,6) + "\n");
    System.out.print(sum(5,6,1) + "\n");
    System.out.print(sum(1.0f,2.0f,3.0f) + "\n");
    System.out.print(sum(5,6.0f,1) + "\n");
    }
}
