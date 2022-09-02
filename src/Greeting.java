import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time : ");
        int saat= input.nextInt();
        if (0<saat & 12>saat) {
            System.out.println("Good Morning");
        }else if (12<=saat & 17>saat) {
            System.out.println("Good Afternoon");
        }else if (17<=saat & 24>=saat) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Wrong time");
        }
    }
}
