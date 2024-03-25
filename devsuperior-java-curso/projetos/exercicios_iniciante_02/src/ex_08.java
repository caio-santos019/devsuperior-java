import java.util.Locale;
import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario;
        double imposto = 0;
        double diferenca;

        System.out.println("Digite seu salario:");
        salario = sc.nextDouble();

        if (salario > 4500) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = salario - 4500;
            imposto += diferenca * 0.28;
        } else if (salario > 3000) {
            imposto = 1000 * 0.08;
            diferenca = salario - 3000;
            imposto += diferenca * 0.18;
        } else if (salario > 2000) {
            diferenca = salario - 2000;
            imposto = diferenca * 0.08;
        }

        if (imposto > 0) {
            System.out.println("R$ " + imposto);
        } else {
            System.out.println("Isento");
        }

        sc.close();
    }
}