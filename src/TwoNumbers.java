import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        //Write a Java program that will accept two numbers and check if two numbers are equal or not.
            Scanner input=new Scanner(System.in);
            System.out.print("1. Sayıyı Giriniz: ");

            double bir=input.nextDouble();
            System.out.print("2. Sayıyı Giriniz: ");
            double iki=input.nextDouble();

            if(bir>iki){
                System.out.println("1. sayı büyüktür.");
            }else if(iki>bir) {
                System.out.println("2. sayı büyüktür.");
            }else {
                System.out.println("Sayillar eşittir.");
            }
        }
    }
