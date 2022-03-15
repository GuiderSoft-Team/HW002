public class MultTable {
    public static void main(String[] args) {
        //TODO: Write a Java program that prepares the multiplication tables from 1 to 10.
        System.out.println("çarpım tablosu");
        int sayı = 0;
        int çarpım = 0;

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i+". tablo");
        for (int a = 0; a <= 10; a++) {
            çarpım = a * sayı;
            System.out.print(a);
            System.out.print(" x ");
            System.out.print(sayı);
            System.out.print(" = ");
            System.out.println(çarpım);

        }
            sayı++;
            System.out.println(" ");

        }
    }
}
