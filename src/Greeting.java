public class Greeting {
    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        double saat = 11.30;
        if (saat<12){
            System.out.println("günaydın");

        }
        else if (12<=saat & saat<17){
            System.out.println("tünaydın");
        }
        else{
            System.out.println("iyi akşamlar");
        }
    }
}

