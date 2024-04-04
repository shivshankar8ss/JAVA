import java.util.*;
public class circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of the circle");
        double rad = sc.nextDouble();
        double area = 3.14 * rad * rad;
        double perimeter = 6.28 * rad;
        System.out.println("Area of Circle is "+area+" and it's perimeter is "+perimeter);
    }
}


