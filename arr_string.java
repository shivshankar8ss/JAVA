import java.util.*;
public class arr_string {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of the array");
    int n = sc.nextInt();
    String name[] = new String[n];
    System.out.println("enter the names");
    for(int i=0; i<n; i++){
        name[i]=sc.next();
    }
    for(int i=0; i<n; i++){
        System.out.println("name "+(i+1)+" is "+name[i]);
    }
    }
}
