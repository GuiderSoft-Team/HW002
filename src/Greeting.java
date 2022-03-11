import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening

        //Olumsuz durumlar için programı iyileştir.

        Scanner input = new Scanner(System.in);

        System.out.println("Welkam to time programme...");
        System.out.println("************************************************************************************");

        System.out.print("What time is it there dude (e.g. = 17,29) : ");
        double time = input.nextDouble();



        if (time < 12.00) {
            System.out.println("Greetings and Good morning! My fellow American.");

        }else if (time < 17.00) {
            System.out.println("Good afternoon!?!");


        }else if (time <= 24.00) {
            System.out.println("Good eveninggggggg.");

        }
    }
}

