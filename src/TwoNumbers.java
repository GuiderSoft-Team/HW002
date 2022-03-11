import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz : ");
        int sayi1=input.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz : ");
        int sayi2=input.nextInt();

        if (sayi1==sayi2){
            System.out.println("Girilen sayılar eşittir");
        }else{
            System.out.println("Girilen sayılar eşit değildir.");
        }

    }
}
