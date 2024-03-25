import java.util.Scanner;

public class Ex01 {
    /*
     * 
     * QUESTÃO
     * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
     * 1 x N = N 2 x N = 2N ... 10 x N = 10N
     * 
     * ENTRADA
     * A entrada contém um valor inteiro N (2 < N < 1000).
     * 
     * SAÍDA
     * Imprima a tabuada de N, conforme o exemplo fornecido.
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro:");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = i * N;
            System.out.println(i + " X " + N + " = " + product);
        }

        sc.close();
    }
}
