import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha:");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
