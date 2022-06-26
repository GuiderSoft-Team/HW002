
        //TODO: Write a Java program to implement following logic using if statement
        //1. if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 17, greet with Good Afternoon
        //3. if hour is greater than or equal to 17, greet with Good Evening
        //1. if hour is less than 12 noon, greet with Good Morning

        import java.util.Scanner;
                public class Greeting {
                    public static void main(String[] args) {
                        System.out.println("Lütfen Saati Giriniz :");
                        Scanner input = new Scanner(System.in);
                        int saat = input.nextInt();
                        if (0 <= saat & saat < 12) {
                            System.out.println("Günaydin");

                        }else if (saat <= 12 & saat < 17 ) {
                            System.out.println("Iyi Öglenler");

                        }else if (saat >= 17  & saat <= 24) {
                            System.out.println("Iyi Aksamlar");

                        }else {
                            System.out.println("Lütfen gecerli bir saat dilimi seciniz !");
                        }
                    }
                }
