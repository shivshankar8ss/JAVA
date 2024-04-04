import java.util.*;
public class average {
    public static float average(float a,float b,float c){
        float avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        float num1 = sc.nextFloat();
        System.out.println("enter num2");
        float num2 = sc.nextFloat();
        System.out.println("enter num3");
        float num3 = sc.nextFloat();
        float result = average(num1,num2,num3);
        System.out.println(result);
    }
}
