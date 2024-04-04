import java.util.*;
public class string_name {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        //String name = sc.next();
        //System.out.println("your name is "+name);
        //concatenation
        String firstName = "shiv";
        String secondName = "shankar";
       // String fullName = firstName+secondName;
        String fullName = firstName+ "@" +secondName;
        System.out.println("full name is "+fullName);
        //calculating length
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++ ){
            System.out.println(fullName.charAt(i));
        }
    }
}
