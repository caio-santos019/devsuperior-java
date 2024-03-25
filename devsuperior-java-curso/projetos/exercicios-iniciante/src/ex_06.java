import java.util.Locale;
import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A, B, C, pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangleRetangleArea = A * C / 2.0;
		double circleArea = pi * C * C;
		double trapezoidArea = (A + B)/ 2.0 * C;
		double squareArea = B * B;
		double retangleArea = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangleRetangleArea);
		System.out.printf("CIRCULO: %.3f%n", circleArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapezoidArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETANGULO: %.3f%n", retangleArea);

		sc.close();

	}

}
