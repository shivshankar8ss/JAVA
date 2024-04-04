import java.util.*;
public class arr_spiral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int rows = sc.nextInt();
        System.out.println("enter column size");
        int cols = sc.nextInt();
        System.out.println("enter data of the matrix");
        int [][] arr = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix is ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int rowStart = 0;
        int colStart = 0;
        int rowEnd   =rows-1;
        int colEnd   =cols-1;

        System.out.println("Spiral form of the matrix is ");
        while(rowStart <= rowEnd && colStart<=colEnd){
            for(int col = colStart; col<=colEnd; col++){
                System.out.print(arr[rowStart][col] + "->");
            }
            rowStart++;
            for(int row = rowStart; row<=rowEnd; row++){
                System.out.print(arr[row][colEnd] + "->");
            }
            colEnd--;
            for(int col = colEnd; col>=colStart; col--){
                System.out.print(arr[rowEnd][col]+"->");
            }
            rowEnd--;
            for(int row = rowEnd; row>=rowStart; row--){
                System.out.println(arr[row][colStart] +"->");
            }
            colStart++;
            System.out.println();
        }
    }
}
