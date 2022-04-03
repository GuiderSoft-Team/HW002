import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Saati yazınız: ");
        int day=input.nextInt();
        if (day<12){
            System.out.println("Good Morning");
        }else if(day<17){
            System.out.println("Good Afternoon");
        }else{
            System.out.println("Good Evening");
        }
    }
}
//1. if hour is less than 12 noon, greet with Good Morning
//2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
//3. if hour is greater than or equal to 17, greet with Good Evening