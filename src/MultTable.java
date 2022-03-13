public class MultTable {
    public static void main(String[] args) {
        // Write a Java program that prepares the multiplication tables from 1 to 10.
        for (int i = 1; i <=10 ; i++) {
            for (int m = 1; m <=10 ; m++) {
                System.out.print(i+"x"+m+"="+(i*m)+"\t");
            }
            System.out.println();
        }
    }
}
