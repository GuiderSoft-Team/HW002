import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1.sayiyi giriniz :");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen 2. sayiyi giriniz :");
        int sayi2 = input.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("Girilen sayilar esittir.");
        }else{
            System.out.println("Girilen sayilar esit degildir.");
        }
    }
}
