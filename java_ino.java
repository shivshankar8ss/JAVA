import java.util.Scanner;

class takeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("user name is " + name);

        System.out.println("Enter your lucky number");
        int num1 = sc.nextInt();
        System.out.println("user's lucky number is " + num1);
    }
}
