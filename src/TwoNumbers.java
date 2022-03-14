import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //Write a Java program that will accept two numbers and check if two numbers are equal or not.

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("İki sayı eşittir.");

        } else {
            System.out.println("İki sayı eşit değildir");
        }
    }
}