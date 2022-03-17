import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen saati giriniz");
        {
            int hour = (int) input.nextInt();
            {
                if (hour < 12) {
                    System.out.println("GOOD MORNING!");
                } else if (hour <= 12) {
                    System.out.println("GOOD AFTERNOON!!");

                }
                while  (hour >= 17) break; {

                    System.out.println("GOOD AFTERNOON!!");

                    // Write a Java program to implement following logic using if statement
                    //1. if hour is less than 12 noon, greet with Good Morning
                    //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
                    //3. if hour is greater than or equal to 17, greet with Good Evening

                }

            }
        }
    }}
