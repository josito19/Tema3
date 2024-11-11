package englishExercises;

import java.util.Arrays;
import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		// Creation of the scanner and our variables
		Scanner sc = new Scanner(System.in);
		// In table we store ten integer numbers
		int table[] = new int[10];
		int value;
		int position;
		String cases;
		do {
			// We show the menu and then we asign the value written to cases
			System.out.println("a. Show values.\r\n" + "b. Introduce a value.\r\n" + "c. Exit.\r\n");
			cases = sc.next();
			switch (cases) {
			// when case = a, we show our table
			case "a" -> {
				System.out.println(Arrays.toString(table));
			}
			// when its b, we ask for value and position, then we put that value in the
			// position given
			case "b" -> {
				System.out.println("Enter a value:");
				value = sc.nextInt();
				System.out.println("Enter a position:");
				position = sc.nextInt();
				table[position] = value;
			}

			}
		} while (!cases.equals("c"));
		sc.close();
	}

}
