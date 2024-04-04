import java.util.Scanner;

public class circumFun {
    public static double circle(float r){
         double res = 6.28*r;
         return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        float radius = sc.nextFloat();
        double result = circle(radius);
        System.out.println("Circumference is "+ 6.28*radius);
    }
}
