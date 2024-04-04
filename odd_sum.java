import java.util.*;
public class odd_sum {
    public static int sum(int n){
        int r_sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                 r_sum+=i;
            }
        }
        return r_sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println(result);
    }
}
