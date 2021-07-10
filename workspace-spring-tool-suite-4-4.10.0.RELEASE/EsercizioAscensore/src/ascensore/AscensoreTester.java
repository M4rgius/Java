package ascensore;

import java.util.Scanner;

public class AscensoreTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire il massimo delle prenotazioni possibili:");
		int max = in.nextInt();
		Ascensore elevator = new Ascensore(max);
		String t = "";
		int contatore = 0;
		while (!t.equalsIgnoreCase("q")) {
			System.out.println("inserire numero persone che effettuano una prenotazione:");
			int n = in.nextInt();
			System.out.println("inserire il numero di piano per cui le " + n + " persone hanno prenotato:");
			int p = in.nextInt();
			System.out.println("L'ascensore arriva.");
			System.out.println("" + n + " persone salgono in ascensore.");
			elevator.entra(n, p);
			contatore++;
			System.out.println("Info: per termirare le prenotazioni, digitare Q, altrimenti una lettera qualsiasi.");
			t = in.next();
			System.out.println("L'ascensore parte.");
			System.out.println(elevator.toString());
		}
		for (int i = 0; i < contatore; i++) {
			elevator.muovi();
			System.out.println(elevator.toString());
		}
	}
}