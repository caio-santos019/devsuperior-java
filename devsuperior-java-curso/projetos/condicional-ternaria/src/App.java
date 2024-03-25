import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;

        // if (preco < 20.0) {
        // desconto = preco * 0.1;
        // } else {
        // desconto = preco * 0.05;
        // }

        System.out.println(desconto);

        sc.close();
    }
}
