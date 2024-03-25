import java.util.Locale;
import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int itemCode, itemQuantity;

        itemCode = sc.nextInt();
        itemQuantity = sc.nextInt();

        double total;

        if (itemCode == 1) {
            total = itemQuantity * 4.00;
        } else if (itemCode == 2) {
            total = itemQuantity * 4.50;
        } else if (itemCode == 3) {
            total = itemQuantity * 5.00;
        } else if (itemCode == 4) {
            total = itemQuantity * 2.00;
        } else {
            total = itemQuantity * 1.50;
        }

        System.out.printf("TOTAL: R$ %.2f%n", total);

        sc.close();
    }
}
