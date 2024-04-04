import java.util.*;
public class inputMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("enter marks");
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is excellent");
            } else if (marks>=60 && marks<90) {
                System.out.println("This is good");
            }
            else if (marks>=33 && marks<60) {
                System.out.println("This is also good");
            }
            else if (marks>=0 && marks<33) {
                System.out.println("You guys have to study hard");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("Want to continue? (if yes-press 1 otherwise press any number);");
            input = sc.nextInt();
        }
        while (input==1);
    }
}
