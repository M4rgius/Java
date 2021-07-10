package ascensore;

import java.util.Scanner;

public class PrenotazioniTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire numero di piano");
		int nPiano = input.nextInt();
		System.out.println("Inserire numero di persone che desiderano recarsi a quel piano");
		int nPersone = input.nextInt();
		Prenotazioni tester = new Prenotazioni(nPersone, nPiano);
		System.out.println(tester.toString());
	}
}