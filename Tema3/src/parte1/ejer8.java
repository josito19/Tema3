package parte1;

import java.util.Random;
import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		// En valorN almacenaremos el valor de N
		int valorN;
		// Creamos la clase Randomd
		Random numeros = new Random();
		// Creamos nuestro array de 100 números
		int enteros[] = new int[100];
		// Recorremos el array
		for (int i = 0; i < 100; i++) {
			// En cada posición se randomiza un número entre 1 y 10
			enteros[i] = numeros.nextInt(1, 10);
		}
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Solicitamos el valor de N y lo asignamos a la variable valorN
		System.out.println("Valor de N:");
		valorN = sc.nextInt();
		for (int i = 0; i < 100; i++) {
			// Recorremos el array y mostraremos las posiciones en las que aparece N
			if (enteros[i] == valorN) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
