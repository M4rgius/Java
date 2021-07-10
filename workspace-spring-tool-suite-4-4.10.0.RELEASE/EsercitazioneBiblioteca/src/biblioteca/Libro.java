package biblioteca;

public class Libro {
	private int codice;
	private String titolo;
	private Utente utenteAssegnato;

	// Crea un oggetto della classe Libro.
	public Libro(int unCodice, String unTitolo) {
		codice = unCodice;
		titolo = unTitolo;
		utenteAssegnato = null;
	}

	// Restituisce l'utente assegnato.

	public Utente getUtenteAssegnato() {
		return utenteAssegnato;
	}

	// Assegna un utente.

	public void setUtenteAssegnato(Utente unUtente) {
		utenteAssegnato = unUtente;
	}

	// Restituisce la condizione dell'oggetto libro.

	public String toString() {
		return utenteAssegnato + " " + codice + " " + titolo;
	}

	// Restituisce il codice.

	public int getCodice() {
		return codice;
	}
}