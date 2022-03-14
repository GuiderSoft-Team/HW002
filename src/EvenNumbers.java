public class EvenNumbers {
    public static void main(String[] args) {
        //TODO: Write a program that displays all even numbers between 1-50 in same line
        //Each number should be separated by a space character
        writeNumber(1,50);
    }
    public static void writeNumber(int ilkSayi, int ikinciSayi){
        for (int i = ilkSayi; i <=ikinciSayi ; i++) {
            System.out.print(i+" / ");
        }
    }
}
