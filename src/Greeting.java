import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
                Scanner input=new Scanner(System.in);

                System.out.print("Choose an hour a Meeting Clock:<00-24> :");
                int clock= input.nextInt();

                if(clock<12) {
                    System.out.println("Good Morning!");
                    clock=input.nextInt();
                }else if(clock>=12&clock<17) {
                    System.out.println("Good Afternoon!");
                    clock=input.nextInt();
                }else if(clock>=17&clock<20) {
                    System.out.println("Good Evening!");
                    clock=input.nextInt();
                }else if(clock>20&clock<24){
                    System.out.println("Good Night!");
                    clock=input.nextInt();
                }else{
                    System.out.println("GEÇERSİZ SAAT DİLİMİ:"+clock);

                }




        }
    }

