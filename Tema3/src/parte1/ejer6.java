package parte1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos el array tabla con logitud 8
		int tabla[] = new int[8];
		// Solicitamos los 8 números
		System.out.println("Introduzca 8 números:");
		// Creamos un bucle for para recorrer la tabla
		for (int i = 0; i < 8; i++) {
			// Asignamos los valores a la tabla cada vez
			tabla[i] = sc.nextInt();
		}
		// En un bucle distinto recorremos la tabla
		for (int i = 0; i < 8; i++) {
			// con el if else mostraremos los datos de la tabla con la palabra par o impar
			// dependiendo de si su división entre dos es cero
			if (tabla[i] % 2 == 0) {
				System.out.println(tabla[i] + " es par.");
			} else {
				System.out.println(tabla[i] + " es impar.");
			}
		}

		sc.close();
	}

}
