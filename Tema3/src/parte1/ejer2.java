package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tabla[] = new double[5];
		System.out.println("Introduzca 5 números decimales:");
		for (int i = 0; i <= tabla.length - 1; i++) {
			tabla[i] = sc.nextDouble();
		}
		System.out.println(Arrays.toString(tabla));
		sc.close();
	}

}
