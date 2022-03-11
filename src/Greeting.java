import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Saati Giriniz : ");
        Scanner input = new Scanner(System.in);
        int saat = input.nextInt();
        if (0 <= saat & saat < 12) {
            System.out.println("Good Morning");
        } else if (saat <= 12 & saat < 17) {
            System.out.println("Good Afternoon ");
        } else if (saat >= 17 & saat <= 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Lütfen geçerli bir saat giriniz.");
        }
    }

    }

