import java.util.*;
public class arr_ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("Array is in ascending order");
        }
        else{
            System.out.println("array is not in ascending order");
        }
    }
}
