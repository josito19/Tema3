package parte1;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int max = 0;
		int min = 0;
		int tabla[] = new int[10];
		System.out.println("Introduzca 10 números:");
		for (int i = 0; i < 10; i++) {
			tabla[i] = sc.nextInt();
			suma += tabla[i];
			if (i == 0) {
				max = tabla[i];
				min = tabla[i];
			} else {
				// Encontrar el máximo
				if (tabla[i] > max) {
					max = tabla[i];
				}
				// Encontrar el mínimo
				if (tabla[i] < min) {
					min = tabla[i];
				}
			}

		}
		System.out.println("La suma total es: " + suma + "\n El máximo es " + max + " y el mínimo " + min);
		sc.close();
	}

}
