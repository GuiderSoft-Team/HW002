public class MultTable {
    public static void main(String[] args) {
        System.out.println("Carpim Tablosu :");
        int i;
        int j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

