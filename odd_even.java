import java.util.*;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
