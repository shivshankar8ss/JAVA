import java.util.*;
 public class switch_st {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int button = sc.nextInt();

        switch (button){
            case 1: System.out.println("Namaste");
            break;
            case 2: System.out.println("Hello");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid input");
        }
    }
}
