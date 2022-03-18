public class EvenNumbers {
    public static void main(String[] args) {
        //: Write a program that displays all even numbers between 1-50 in same line
        //Each number should be separated by a space character

        int toplam=0;
        for(int i=0;i<=50;i=i+2){
            toplam=toplam+i;
        }
        System.out.println("1 ile 50 ye kadar çift sayıların toplamı="+toplam);

    }
}
