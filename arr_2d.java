import java.util.*;
public class arr_2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int rows = sc.nextInt();
        System.out.println("enter column size");
        int cols = sc.nextInt();

        int [][] arr = new int [rows][cols];
        System.out.println("enter matrix data");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter number to be searched");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]==x){
                    System.out.println("element "+ x +" is present at "+(i+1)+"th rows and "+ (j+1) +"th column");
                    break;
                }
            }
        }


        System.out.println("matrix will look like ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
