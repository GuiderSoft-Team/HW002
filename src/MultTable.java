import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1'den 10'a kadar bir sayı giriniz: ");
        int num;
        num= input.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

    }
}
