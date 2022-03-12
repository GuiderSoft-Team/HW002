public class EvenNumbers {
    public static void main(String[] args) {
        // Write a program that displays all even numbers between 1-50 in same line
        //Each number should be separated by a space character
        int sayi;

        for (sayi =1; sayi < 50; sayi++)
        {
            if(sayi%2==0) {
                System.out.print(  "\t" );
                System.out.print(+sayi);
            }
        }

    }
        }