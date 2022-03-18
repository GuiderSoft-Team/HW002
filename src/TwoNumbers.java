import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Write a Java program that will accept two numbers and check if two numbers are equal or not.

        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı Giriniz=");
        int a = input.nextInt();
        System.out.print("2.Sayı Giriniz=");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("2. Sayı Büyükyür");
        }  if(a==b){
            System.out.println("Girilen Sayılar Birbirine EŞİTTİR");
        }else {
            System.out.println("1.Sayı Büyüktür");
        }


    }
}
