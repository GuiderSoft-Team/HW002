import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //TODO: Write a Java program that will accept two numbers and check if two numbers are equal or not.

        Scanner sc=new Scanner(System.in);
        System.out.print("First Number: ");
        int number1=sc.nextInt();
        System.out.print("Second Number: ");
        int number2=sc.nextInt();
        if (number1==number2){
            System.out.println("Two numbers are equal");
        }else {
            System.err.println("Numbers are not equal");
        }
    }
}
