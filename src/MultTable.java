public class MultTable {
    public static void main(String[] args) {
        // Write a Java program that prepares the multiplication tables from 1 to 10.
        System.out.println( "\t\t\t\t***ÇARPIM TABLOSU***");
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print(i+"x"+j+"="+(i*j));
                System.out.print("\t");
            }
            System.out.println();
           // System.out.println("////////////////////////////////");
        }
    }
}
