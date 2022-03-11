package huseyin_kartal;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        // Write a Java program that will accept two numbers and check if two numbers are equal or not.

        Scanner input = new Scanner(System.in);
        System.out.print("Write first number : ");
        int fnum = input.nextInt();
        System.out.print("Write second number : ");
        int snum = input.nextInt();

        if(fnum==snum){
            System.out.println("The numbers you've entered are equal.");
        }else{
            System.out.println("The numbers you've entered are NOT equal.");
        }
    }
}
