public class EvenNumbers {
    public static void main(String[] args) {
        //Write a program that displays all even numbers between 1-50 in same line
        //Each number should be separated by a space character
        for (int i = 1; i <= 50 ; i++) {
            if (i%2 ==0){
                System.out.print(i);
                System.out.print(" ");
            }

        }

    }
}
