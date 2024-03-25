import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM NÚMERO:");

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();

    }
}
