
import java.util.Scanner;

public class Userinput2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your height :");
        float height = scan.nextFloat();
        System.out.println("height is " + height);

        scan.nextLine();
        System.out.println("Enter your full name :");
        String fname = scan.nextLine();
        System.out.println("Full name is : " + fname);
    }
}
