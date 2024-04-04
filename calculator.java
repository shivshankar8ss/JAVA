import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        float a = sc.nextFloat();
        System.out.println("enter b");
        float b = sc.nextFloat();
        System.out.println("select any one from + - * / or %");
        System.out.println("enter choice");
        char choice = sc.next().charAt(0);
        switch (choice){
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default: System.out.println("enter valid choice");
        }
    }
}
