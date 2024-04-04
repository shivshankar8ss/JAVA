import java.util.*;
public class bit_man_set {
    public static void main(String[] args){
        // set bit is used to make zero to one
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();

        int bitmask = 1<<pos;
        int new_num = bitmask | n;
        System.out.println("new number is");
        System.out.println(new_num);
    }
}
