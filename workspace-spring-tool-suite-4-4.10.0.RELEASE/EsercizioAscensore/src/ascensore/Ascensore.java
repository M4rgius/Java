package ascensore;

public class Ascensore {
	private final int MAXPIANI = 4;
	private final int MAXPERSONE = 5;
	private Prenotazioni[] prenota;
	private int numPrenotazioni;
	private int pianoCorr;
	private int personeCorr;

	/**
	 * Creo un oggetto della classe Ascensore.
	 * 
	 * @param unMax Il numero massimo di prenotazioni che si possono accodare.
	 */
	public Ascensore(int unMax) {
		prenota = new Prenotazioni[unMax];
		numPrenotazioni = 0;
		pianoCorr = 0;
		personeCorr = 0;
	}

	/**
	 * Si incrementa il numero di persone nell'ascensore e si mette in coda la
	 * relativa prenotazione quando ciò è possibile.
	 * 
	 * @param persone Le persone che vogliono entrare in ascensore.
	 * @param piano   Il piano cui queste persone vogliono andare.
	 */
	public boolean entra(int persone, int piano) {
		if (personeCorr + persone > MAXPERSONE)
			return false;
		else if (piano > MAXPIANI || piano < 0)
			return false;
		else if (numPrenotazioni == prenota.length)
			return false;
		else {
			personeCorr += persone;
			prenota[numPrenotazioni] = new Prenotazioni(persone, piano);
			numPrenotazioni++;
			return true;
		}
	}

	/**
	 * Porta l'ascensore al piano specificato dalla prima prenotazione trovata, fa
	 * uscire le persone relative ed aggiorna la lista delle prenotazioni.
	 */
	public void muovi() {
		if (numPrenotazioni > 0) {
			pianoCorr = prenota[0].getPiano();
			personeCorr = personeCorr - prenota[0].getPersone();
			System.arraycopy(prenota, 1, prenota, 0, prenota.length - 1);
			numPrenotazioni--;
		}
	}

/**Stampa la descrizione dello stato attuale dell'ascensore,
comprese prenotazioni in coda.
@return Lo stato attuale dell’ascensore.*/
public String toString()
{
 String r = "";
 for (int i = 0; i < numPrenotazioni; i++)
 {
 r = r + prenota[i].toString() + "\n";
 String s = "";
 return s = "Piano corrente: " + pianoCorr + "." + "\n" + "Persone in ascensore:" + personeCorr + "\n" + r;
 }
return r;
}}