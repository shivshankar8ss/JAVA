import java.util.*;

public class insertion_sort {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter size of the array");
                int n = sc.nextInt();
                System.out.println("enter array elements");
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                }

                for (int i = 1; i < n; i++) {
                        int curr = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > curr) {
                                arr[j + 1] = arr[j];
                                j--;
                        }
                        arr[j + 1] = curr;
                }
                for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                }
        }
}
