import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
            System.out.println("Lütfen Saati Giriniz :");
            Scanner input = new Scanner(System.in);
            int saat = input.nextInt();
            if (0 <= saat & saat < 12) {
                System.out.println("Günaydin");

            }else if (saat <= 12 & saat < 17 ) {
                System.out.println("Iyi Öglenler");

            }else if (saat >= 17  & saat <= 24) {
                System.out.println("Iyi Aksamlar");

            }else {
                System.out.println("Lütfen gecerli bir saat dilimi seciniz !");
            }
        }
    }
