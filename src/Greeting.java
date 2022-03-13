import java.util.Scanner;

public class Greeting {


    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        Scanner input=new Scanner(System.in);
        System.out.print("What's the time?: ");
        int saat=input.nextInt();
        if (saat<12){
            System.out.println("Good Morning!");
        }else if (12<saat&saat<17){
            System.out.println("Good Afternoon!");
        }else{
            System.out.println("Good Evening!");
        }
    }
}
