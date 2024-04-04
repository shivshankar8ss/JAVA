import java.util.*;
public class arr_search_idx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the numbers");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the number you wanna to search");
        int x = sc.nextInt();
        for (int i=0; i<n; i++){
            if(arr[i]==x){
                System.out.println(x+" is found at index "+i);
                break;
            }
        }
    }
}
