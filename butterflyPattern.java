import java.util.*;
public class butterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
//      code for upper-half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
           System.out.println();
        }
//        code for lower-half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
