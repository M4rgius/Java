package ascensore;

public class Prenotazioni {
	private int persone;
	private int piano;

	/**
	 * Creo un oggetto della classe Prenotazioni.
	 * 
	 * @param nPersone Numero di persone che prenota.
	 * @param nPiano   Numero di piano.
	 */
	public Prenotazioni(int nPersone, int nPiano) {
		persone = nPersone;
		piano = nPiano;
	}

	/**
	 * Restituisce il numero di persone.
	 * 
	 * @return Numero di persone.
	 */
	public int getPersone() {
		return persone;
	}

	/**
	 * Restituisce il numero del piano.
	 * 
	 * @return Numero del piano.
	 */
	public int getPiano() {
		return piano;
	}

	/**
	 * Stampa la situazione delle prenotazioni.
	 * 
	 * @return Situazione prenotazioni.
	 */
	public String toString() {
		String s = "";
		s = "il piano " + piano + " è stato prenotato da " + persone + " persone." + "\n";
		return s;
	}
}