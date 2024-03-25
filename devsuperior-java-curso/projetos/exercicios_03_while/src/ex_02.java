import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME AS COORDENADAS X E Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while ((x > 0 || x < 0) && (y > 0 || y < 0)) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
                x = sc.nextInt();
                y = sc.nextInt();
            } else if (x > 0 && y < 0) {
                System.out.println("quarto quadrante");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }

        sc.close();
    }
}
