/*
 * Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
 * con contratto a ricarica.
 * Tale classe prevede due variabili d'istanza. 
 * La prima variabile d'istanza e' definita come private double carica, e rappresenta il quantitativo di euro
 * disponibile per le chiamate. 
 * La seconda variabile d'istanza e' definita come private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
 * il cellulare. 
 * La classe deve implementare un costruttore public Cellulare(double unaCarica), che prende come parametro esplicito la quantita' di euro della
 * ricarica iniziale. 
 * La classe deve inoltre implementare i seguenti metodi
 * 
 * 
 * Un metodo definito come public void ricarica(double unaRicarica), che ricarica il telefonino.
 * Un metodo definito come public void chiama(double minutiDurata), che effettua una chiamata di durata in minuti specificata dal parametro esplicito.
 * Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la memoria
 * contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
 * di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
 * che restituisce il valore della carica disponibile. 
 * Un metodo public intgetNumeroChiamate(), che restituisce il valore della variabile d'istanza
 * numeroChiamate. 
 * Infine, un metodo public void azzeraChiamate(), che azzera la
 * variabile contenente il numero di chiamate effettuate dal telefonino.
 */

package esercitazioneCellulare;

public class Cellulare {

	//Variabili di istanza
	private double carica;
	private int numeroChiamate;

	// costruttore, carica iniziale telefono
	public Cellulare(double unaCarica) {
		this.carica = unaCarica;
		numeroChiamate = 0;
	}

	// ricarica il telefono
	public void ricarica(double unaRicarica) {
		this.carica += unaRicarica;
	}

	// effettua chiamata (Tale metodo dovra' aggiornare la carica disponibile, ed
	// incrementare la memoria contenente il numero di chiamate effettuate dal
	// telefonino. Si assuma un costo di 0.20 euro per ogni minuto di chiamata
	public void chiama(double minutiDurata) {
		// incremento il numero di chiamate effettuate
		this.numeroChiamate++;

		// Aggiorno la carica,Si assuma un costo di 0.20 euro per ogni minuto di
		// chiamata
		this.carica -= (minutiDurata * 0.2);
	}

	// restituisco il credito attuale
	public double numero404() {
		return this.carica;
	}

	// restituisco il numero di chiamate effettuate
	public int getNumeroChiamate() {
		return this.numeroChiamate;
	}

	// azzero il numero di chiamate effettuate
	public void azzeraChiamate() {
		this.numeroChiamate = 0;
	}
}
