public class MultTable {
    public static void main(String[] args) {
        //TODO: Write a Java program that prepares the multiplication tables from 1 to 10.
        for (int a=1;a<=10;a++){
            for (int b = 1; b <=10 ; b++) {
                System.out.print(a+"*"+b+"="+a*b+" ");
            }
                System.out.println();
        }
    }
}
