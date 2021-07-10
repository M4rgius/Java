package esercitazioneOOP;

public class Studente extends Persona {

	// attributi
	private int matricola;
	private double mediaVoti;

	// costruttori

	public Studente(String nome1, String cognome1, int eta1, int matricola1, double mediaVoti1) {
		super(nome1, cognome1, eta1);
		matricola = matricola1;
		mediaVoti = mediaVoti1;

	}

	//getter e setter
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public double getMediaVoti() {
		return mediaVoti;
	}

	public void setMediaVoti(double mediaVoti) {
		this.mediaVoti = mediaVoti;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", mediaVoti=" + mediaVoti + "]";
	}
	
	
	
	

}
