/*Scrivere una classe Libro le cui istanze rappresentano libri.
 *  La classe deve contenere una variabile di istanza int numPagine, 
 *  un costruttore che assegna al libro un numero specificato di pagine, 
 *  ed un metodo pageMessage() che stampa il numero di pagine del libro,
 *   oltre al metodo getter int getNumPagine() che ritorna il numero delle pagine.  */

package esercitazineLibro;

class Libro {
	 protected int numPagine;
	 public Libro(int num){
	numPagine = num;
	 }
	 public void pageMessage(){
	System.out.println("Numero di pagine: " + numPagine);
	 }
	}
	class Vocabolario extends Libro{
	 protected int numDefinizioni;
	 public Vocabolario(int numP, int numD){
	super(numP);
	numDefinizioni = numD;
	 }
	 public void definitionMessage(){
	super.pageMessage();
	System.out.println("Numero di definizioni: " + numDefinizioni);
	System.out.println("Numero medio di definizioni per pagina: " +
	 numDefinizioni/numPagine);
	 }
	}

