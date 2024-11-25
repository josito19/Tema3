package parte1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[8];
		System.out.println("Introduzca 8 números:");
		for (int i = 0; i < 8; i++) {
			tabla[i] = sc.nextInt();
		}
		for (int i = 0; i < 8; i++) {
			if (tabla[i] % 2 == 0) {
				System.out.println(tabla[i] + " es par.");
			} else {
				System.out.println(tabla[i] + " es impar.");
			}
		}

		sc.close();
	}

}
