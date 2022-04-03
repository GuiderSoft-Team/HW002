import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.print("İlk sayıyı giriniz: ");
        firstNumber= input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        secondNumber=input.nextInt();

        if ((firstNumber - secondNumber) == 0)
            System.out.println("Sayılar eşit");
        else
            System.out.println("Sayılar eşit değil");
    }
}
