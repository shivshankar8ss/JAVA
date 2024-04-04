import java.util.*;
public class bit_man_update {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();
        System.out.println("enter bit to be manipulated(either 0 or 1)");
        int oper = sc.nextInt();
        int bitmask = 1<<pos;

        System.out.println("new number is");
        if(oper == 1){
            int new_number = bitmask | n;
            System.out.println(new_number);
        }

        else{
            int new_bitmask = ~(bitmask);
            int new_num = new_bitmask & n;
            System.out.println(new_num);
        }
    }
}
