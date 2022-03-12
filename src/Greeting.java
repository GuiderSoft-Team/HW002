import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        System.out.print("Lütfen 24 saat formatında saati giriniz:");
        Scanner input = new Scanner(System.in);
        int saat=input.nextInt();
        if (saat>=0&saat <12){
            System.out.println("Good Morning");
        }
        else if (saat>12&saat<17){
            System.out.println("Good Afternoon");
        }
        else if (saat<=24&saat>=17){
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Hatalı Saat girişi!!!");
        }


    }
}
