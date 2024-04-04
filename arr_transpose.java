import java.util.*;
public class arr_transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of rows");
        int rows = sc.nextInt();
        System.out.println("enter size of column");
        int cols = sc.nextInt();

        System.out.println("enter data of matrix");
        int [][] arr = new int [rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix is");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix is");
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
