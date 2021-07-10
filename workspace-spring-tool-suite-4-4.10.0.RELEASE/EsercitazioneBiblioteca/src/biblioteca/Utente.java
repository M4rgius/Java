package biblioteca;

public class Utente {
	private String nome;
	private String cognome;

	//Crea un oggetto della classe Utente.
	
	public Utente(String unNome, String unCognome) {
		nome = unNome;
		cognome = unCognome;
	}

	// Restituisce il nome dell'utente
	public String getNome() {
		return nome;
	}

	//Restituisce il cognome dell'utente.
	 
	public String getCognome() {
		return cognome;
	}

	// Restituisce nome e cognome dell'utente.
	 
	public String toString() {
		return nome + " " + cognome;
	}
}
