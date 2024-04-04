import java.util.*;
public class bit_man_clear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;

        int new_bitmask = ~(bitmask);
        int new_number = new_bitmask & n;
        System.out.println("new number is ");
        System.out.println(new_number);
    }
}
