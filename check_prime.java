import java.util.*;
public class check_prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        for(int i=2; i <=num/2; i++){
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
            else{
                System.out.println("Prime");
                return;
            }
        }
    }
}
