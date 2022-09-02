import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int sayi1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int sayi2 = input.nextInt();
        if (sayi1 == sayi2) {
            System.out.println("Numbers are eqaul");
        } else {
            System.out.println("Numbers are NOT equal");

        }
    }
}