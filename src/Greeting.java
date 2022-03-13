import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening

        Scanner input=new Scanner(System.in);
        System.out.print("lütfen saati giriniz=");
        int hour=input.nextInt();

        if (hour<12 & hour>0) {
            System.out.println("good morning");
        }else if (hour >=12 & hour<17 ) {
            System.out.println("good afternoon");

        }else if(hour>17){
            System.out.println("good evening");
        }else{
            System.out.println("yanlış saat girildi");
        }

    }
}
