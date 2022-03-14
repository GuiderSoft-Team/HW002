import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening

        Scanner input=new Scanner(System.in);
        System.out.print("What time is it?: ");
        int hour=input.nextInt();

        if(0<hour&hour<12){
            System.out.println("Good Morning");
        }
        if(12<=hour&hour<17) {
            System.out.println("Good Afternoon");
        }
        if(17<=hour&hour<24) {
            System.out.println("Good Evening");
        }
        else if(24<hour){
            System.out.println("Invalid time!");
        }



    }
}
