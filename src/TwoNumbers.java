import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to another programe which checks if the numbers that you gave me is equal or not?!");

        System.out.print("First Number: ");
        int no1 = input.nextInt();



        System.out.print("Second Number: ");
        int no2 = input.nextInt();



        System.out.println("Processing...............................");

        if (no1 == no2) {
            System.out.println("your numbers are equal. (In case you didn't know)");
        } else {
            System.out.println("your numbers are not equal. (thanks for checking in)");
        }

    }
}
