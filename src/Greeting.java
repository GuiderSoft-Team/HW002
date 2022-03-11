import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What time is it? (Please use between 1-24)");
        int saat= input.nextInt();

        if (saat<12){
            System.out.println("Good Morning");
        }if (saat>=12)
        if (saat<17){
                System.out.println("Good Afternoon");
        }if (saat>=17)
        if (saat<=24){
            System.out.println("Good Evening");
        }if (saat>=25) {
            System.out.println("Your number is wrong.");
        }
    }
}
