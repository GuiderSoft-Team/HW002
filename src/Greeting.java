import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen saati giriniz : ");
        int saat= input.nextInt();
        if (0<=saat&saat<12){
            System.out.println("Good Morning");
        }else if (saat<=12&saat<17){
            System.out.println("Good Afternoon");
        }else if (saat>=17&saat<24){
            System.out.println("Good Evening");
        }else{
            System.out.println("Saati yanlış girdiniz.");
        }


    }
}
