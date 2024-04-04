import java.util.*;
public class print_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        for(int i=0; i<=num; i++){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
    }
}
