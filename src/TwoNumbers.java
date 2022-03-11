import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number1= scan.nextInt();
        System.out.print("Please enter the second number:");
        int number2= scan.nextInt();

        if(number1==number2){
            System.out.println("The numbers you entered are equal");
        }else{
            System.out.println("The numbers you entered are not equal");
        }
    }
}
