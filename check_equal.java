import java.util.*;
public class check_equal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
//        method 1
//        if(a==b){
//            System.out.println("Equal");
//        }
//        else {
//            if(a > b){
//                System.out.println(a+" is greater");
//            }
//            else {
//                System.out.println(b+" is greater");
//            }
//        }

//        method 2  : using if and else if statement
        if(a==b){
            System.out.println("Equal");
        }
        else if (a>b) {
            System.out.println(a+" is greater");
        }
        else {
            System.out.println(b+" is greater");
        }

    }
}
