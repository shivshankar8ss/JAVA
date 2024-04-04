import java.util.*;
public class opp_starPyra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
