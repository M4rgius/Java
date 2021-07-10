
public class EsercizioUno {

	
		// Ciclo for
	public static int sommaFor() {

		// dichiariamo una variabile per contenere la somma di tipo inter.
		int somma = 0;
		for (int i = 0; i < 31; i++) {
			if (i % 3 == 0) {
				somma += i; // somma = somma + i;
			}
		}
		return somma;

	}

	public static int sommaWhile() {
		// Ciclo while
		int somma = 0;
		int counter = 0;
		while (counter < 31) {
			if (counter % 3 == 0) {
				somma += counter;
			}
			counter++;
		}
		return somma;
	}

	// Ciclo do-while

	public static int sommaDoWhile() {
		int somma = 0;
		int counter = 0;
		do {
			if (counter % 3 == 0) {
				somma += counter;
			}
			counter++;
		} while (counter < 31);

		return somma;

	}

	public static void main(String[] args) {
		System.out.println("La somma è:" + sommaFor());
		System.out.println("ciclo while" + sommaWhile());
		System.out.println("ciclo do-while" + sommaDoWhile());

	}
}
