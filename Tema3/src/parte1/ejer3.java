package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];

		for (int i = 9; i >= 0; i--) {
			tabla[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(tabla));

		sc.close();
	}

}
