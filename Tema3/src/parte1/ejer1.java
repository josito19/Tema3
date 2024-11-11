package parte1;

import java.util.Arrays;
import java.util.Random;

public class ejer1 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(1, 101);
			tabla[i] = num;
		}
		System.out.println(Arrays.toString(tabla));
	}

}
