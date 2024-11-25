package parte1;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		System.out.println("Introduzca 10 números:");
		for (int i = 0; i < 10; i++) {
			tabla[i] = sc.nextInt();

		}
		System.out.println("Inverso:");

		for (int i = 9; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		sc.close();
	}

}
