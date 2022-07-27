public class Greeting {
    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        int zaman =12;
        if (zaman < 12) {
            System.out.print("gunaydin.");

        } else if (zaman >= 12 & zaman < 17) {

            System.out.println("goodafternoon");


        }else if (zaman >= 17) {
                System.out.println("good evning");
            }
            }

        }
