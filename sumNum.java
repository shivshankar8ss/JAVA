import java.util.*;
public class sumNum {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1st number");
            int a = sc.nextInt();
            System.out.println("enter 2nd number");
            int b = sc.nextInt();
            int sum=calculateSum(a,b);
            System.out.println("Sum of "+a+" and "+b+" is "+sum);
        }
    }
