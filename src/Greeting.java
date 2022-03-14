public class Greeting {
    public static void main(String[] args) {
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        greeting(8);
        greeting(13);
        greeting(21);

    }
    public static void greeting(int clock){
        if (clock<12){
            System.out.println("good morning");
        }else if(clock>=12&clock<17) {
            System.out.println("good afternoon");
        }else if (clock>=17){
            System.out.println("good evening");
        }


    }
}
