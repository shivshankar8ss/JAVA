import java.util.*;
public class factNum {
    public static long factorial(int num){
        if(num ==0){
           return 1;
        }
        long result=1;
        while (num!=1){
          result = result*num;
          num--;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input number");
        int a = sc.nextInt();
        long f = factorial(a);
        System.out.print("Factorial of the number is "+f);
    }
}
