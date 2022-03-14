public class MultTable {
    public static void main(String[] args) {
        //Write a Java program that prepares the multiplication tables from 1 to 10.

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <=10 ; j++) {
                System.out.print(i+"x"+j+"="+(i*j)+"\t");

            }
            System.out.println();

        }


    }
}
