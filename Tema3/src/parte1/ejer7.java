package parte1;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos el array para la temperatura media de cada mes
		double tempMedia[] = new double[12];
		// Creamos un array formado por los meses del año
		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		// Solicitamos la temperatura media de cada mes del año
		System.out.println("Introduzca la temperatura media de cada mes del año:");
		// Con el bucle for recorremos la tabla
		for (int i = 0; i < 12; i++) {
			// Indicamos el mes a introducir
			System.out.print(meses[i] + ": ");
			// Almacenamos los datos en el array tempMedia
			tempMedia[i] = sc.nextDouble();
		}
		// Aquí empieza el Diagrama de barras
		System.out.println("Diagrama de barras:");
		// Creamos un bucle para separar por líneas los meses
		for (int i = 0; i < 12; i++) {
			// Redondeamos a entero y asignamos cada valor del array en barras
			int barras = (int) tempMedia[i];
			// Mostramos el mes de cada línea
			System.out.println(meses[i]);
			// Creamos otro bucle que imprimirá un asteriscos por cada unidad de temperatura
			for (int j = 0; j < barras; j++) {
				System.out.print("*");
			}
			// Al final de cada línea mostraremos la temperatura media de ese mes
			System.out.println(" " + tempMedia[i]);
		}

		sc.close();
	}

}
