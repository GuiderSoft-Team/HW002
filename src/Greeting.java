import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number between 0 and 24:");
            int time = input.nextInt();


            if ((0 <= time) && (time <= 4)) {
                System.out.println("Good Night");
            } else if ((4 < time) && (time <= 12)) {
                System.out.println("Good Morning");
            } else if ((12 < time) && (time <= 17)) {
                System.out.println("Good Afternoon");
            } else if ((17 < time) && (time <= 24)) {
                System.out.println("Good Evening");
            }else{
                System.out.println("You entered a wrong number");
            }
        }
    }
}

