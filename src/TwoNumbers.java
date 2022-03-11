import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //TODO: Write a Java program that will accept two numbers and check if two numbers are equal or not.
        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayi : ");
        int sayi1= input.nextInt();
        System.out.print("2. Sayi : ");
        int sayi2= input.nextInt();

        if (sayi1==sayi2){
            System.out.println("Iki sayı eşittir.");
        }else {
            System.out.println("Iki sayi eşit değildir.");
        }
    }
}
