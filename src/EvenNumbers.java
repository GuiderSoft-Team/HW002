public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("\n1'den 50'ye kadar olan çift sayılar: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }
    }
}
