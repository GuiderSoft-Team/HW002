package huseyin_kartal;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please write the exact hour in 24hr format : ");
        int hour = input.nextInt();

        if (hour >= 0 & hour <= 24) {
            if (hour < 12) {
                System.out.println("Good Morning");
            } else if (hour < 17) {
                System.out.println("Good Afternoon");
            } else{
                System.out.println("Good Evening");
            }
        } else {
            System.out.println("Yanlış giriş yaptınız.");
        }
    }
}
