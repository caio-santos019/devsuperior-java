import java.util.Locale;
import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtt1, qtt2;
		double value1, value2, finalValue;
		
		cod1 = sc.nextInt();
		qtt1 = sc.nextInt();
		value1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtt2 = sc.nextInt();
		value2 = sc.nextDouble();
		
		finalValue = qtt1 * value1 + qtt2 * value2;
		
		System.out.println("CÓDIGOS DOS PRODUTOS: " + cod1 + " e " + cod2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", finalValue);
		
		
		sc.close();

	}

}