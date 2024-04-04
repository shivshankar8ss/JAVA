import java.util.*;
public class solidRect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int n = sc.nextInt();
        System.out.println("enter no. of columns");
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
