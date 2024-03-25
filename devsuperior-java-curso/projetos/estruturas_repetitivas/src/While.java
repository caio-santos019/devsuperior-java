import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0; // colocamos o 0 porque a variavel tem que iniciar com alguma coisa, e o 0 é o
                      // elemento neutro da soma.

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
