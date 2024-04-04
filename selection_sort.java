import java.util.*;
public class selection_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int smallest = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
