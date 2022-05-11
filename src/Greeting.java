import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen saat girişi yapınız: ");
        int saat=input.nextInt();
        if (saat<12){
            System.out.println("Good Morning");
        }else if(saat<17){
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

    }
}
