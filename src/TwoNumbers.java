import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.Sayıyı Giriniz:");
        int sayi1=input.nextInt();
        System.out.print("Lütfen 2.Sayıyı Giriniz:");
        int sayi2=input.nextInt();
        if (sayi1==sayi2){
            System.out.println("İki sayı birbirine eşittir.");
        }
        else {
            System.out.println("Sayılar eşit değil!");
        }
    }
}
