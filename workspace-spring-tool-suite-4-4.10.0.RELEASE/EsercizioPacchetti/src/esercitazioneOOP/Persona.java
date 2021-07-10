package esercitazioneOOP;

//Esempio

public class Persona {
	// attributi
	private String nome;
	private String cognome;
	private int eta;

	// costruttori

	// costruttore con parametri
	public Persona(String nome, String cognome, int eta) {
		// si assegna il "this." per accedere all'informazione...
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;

	}

	// costruttore di default
	public Persona() {
		nome = "";
		cognome = "";
		eta = 0; 

	}

	// costruttore di copia
	public Persona(Persona p) {
		this.nome = p.nome;
		this.cognome = p.cognome;
		this.eta = p.eta;

	}

	// per chiamare i metodi usiamo "get" e "set"

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// Metodi accessori
	public void stampa() {
		System.out.println("Persona; nome:" + this.getNome() + " cognome " + this.cognome + " eta: " + this.eta);
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", getNome()=" + getNome()
				+ ", getCognome()=" + getCognome() + ", getEta()=" + getEta() + "]";
	}

}
