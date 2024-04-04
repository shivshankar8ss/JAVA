import java.io.Console;
import java.util.*;
public class greater_two {
    public static int greater(int a,int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();
        System.out.println("Greater number is "+greater(x,y));
    }
}
