import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please write first number : ");
        int firstNum=input.nextInt();
        System.out.print("Please write second number : ");
        int secondNum= input.nextInt();
        if (firstNum==secondNum){
            System.out.println("-".repeat(30)+"\nGreat! Your two numbers is equals.");
        }else {
            System.out.println("-".repeat(30)+"\nSorry:( Your two numbers is not equals. ");
        }

    }
}
