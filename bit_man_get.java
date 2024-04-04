import java.util.*;
public class bit_man_get {
    // get bit is used to know either bit was zero or one
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter position");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;

        if((bitmask & n) ==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was 1");
        }
    }
}
