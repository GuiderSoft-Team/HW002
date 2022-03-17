import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        // Write a Java program that prepares the multiplication tables from 1 to 10.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

             for (int i = 1; i <=10 ; i++)

                    System.out.print(i+"X"+ n+"= "+(i*n)+"\t");

        }
    }




