import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        if (sayi1==sayi2) {
            System.out.println("Two numbers are equal!");
            } else {
                System.out.println("Two numbers are not equal!");
        }
    }
}