import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;
        start = sc.nextInt();
        end = sc.nextInt();

        int totalTime;

        if (start < end) {
            totalTime = end - start;
        } else {
            totalTime = 24 - start + end;
        }

        System.out.println("O JOGO DUROU " + totalTime + " HORA(S)");

        sc.close();
    }
}
