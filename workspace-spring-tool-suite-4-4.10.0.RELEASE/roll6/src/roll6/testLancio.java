package roll6;

import java.util.Scanner;

public class testLancio {

	public static void main(String[] args) {
		// Creo un nuovo dado con X facce, implementare l'input
		Dado d = new Dado(6);
		Scanner in = new Scanner(System.in);

		// Simulo una certa quantità di lanci come in D&D
		System.out.println("Quanti lanci vuoi simulare?");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int r = d.lancia();

			System.out.print(r + "  ");
		}

	}
}
