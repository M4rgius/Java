package cellulare;

public class CellulareTester {
	public static void main(String[] args) {
		/**
		 * Creo un oggetto della classe Cellulare, con X€ di credito e 0 chiamate
		 * effettuate.
		 */
		Cellulare Samsung = new Cellulare(50.0, 1);

		// Ricarico il cellure di X€.
		Samsung.ricarica(20.0);

		// Effettuo una chiamata di X minuti.
		Samsung.chiamata(30.0);

		// Stampo il credito
		System.out.println("Credito che mi aspetto " + Samsung.numero404());

		// Stampo il numero di chiamate effettuate.
		System.out.println("Numero Chiamate, mi aspetto: " + Samsung.getNumeroChiamate());

		// Azzero il numero di chiamate effettuate.
		Samsung.azzeraChiamate();

		// Stampo il numero di chiamate effettuate.
		System.out.println("Numero Chiamate, mi aspetto: " + Samsung.getNumeroChiamate());

	}
}
