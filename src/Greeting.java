import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        int hour =23;

        if ( hour < 12 ) {
            System.out.println("Good Morning!");
        } else if ( hour >= 12 && hour < 17 ) {
            System.out.println("Good Afternoon!");
        } else  {
            System.out.println("Good Evening!!");
        }




    }
}


