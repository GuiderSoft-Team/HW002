import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        Scanner time=new Scanner(System.in);
        System.out.print("Lütfen Saati Giriniz=");
        int sa=time.nextInt();
        System.out.println("********************");

        if(sa<12){
            System.out.println("Günaydın Hayırlı İşler");
        }else if(12<=sa&&sa<17){
            System.out.println("İyi Öğlenden Sonraları");
        }else {
            System.out.println("Hayırlı Akşamlar");
        }



    }
}
