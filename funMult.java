import java.util.*;
public class funMult {
    public static int multiply(int a,int b){
        int mult = a * b;
        return mult;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int num2 = sc.nextInt();
        int result = multiply(num1,num2);

        System.out.println("product is :"+result);
    }
}
