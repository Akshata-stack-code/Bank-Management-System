
import java.util.Scanner;

class Array2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
