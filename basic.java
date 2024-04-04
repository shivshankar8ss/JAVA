import java.util.*;
public class basic {
    public static void main(String[] args){
//        Variables
//        String name ="Bruce wayne";
        int age = 28;
        double price = 12.89;
//        data types     -> (1) Primitive      (2) Non-Primitive
//        primitive      -> byte  short  char  boolean  int  long  float  double
//        Non-Primitive  -> string  array  class  object  interface
        int a =10;
        int b =20;
        int sum =a+b;
        System.out.println(sum);
        int mul = a*b;
        System.out.println(mul);

        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
        String name = sc.nextLine();
//        to take integer type input use nextInt();
//        to take float type input use nextFloat();
        System.out.println(name);
    }
}
