import java.util.*;
public class arr_max_min {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter numbers in array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max =arr[0];
        int min =arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum value is "+max);
        for(int i=1; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum value is "+min);
    }
}
