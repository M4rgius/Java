/*Scrivere quindi una classe Vocabolario che estende la classe Libro. 
 * La classe deve contenere una nuova variabile di istanza, int numDefinizioni,
 *  un costruttore che assegna al vocabolario un numero di pagine (la stessa variabile di Libro) 
 *  e un numero di definizioni specificati, 
 *  ed un metodo definitionMessage() che stampa un messaggio contenente il numero di pagine, 
 *  il numero di definizioni ed il numero medio di definizioni per pagina del vocabolario.  
 * 
 */

package esercitazineLibro;

public class TestLibroVocabolario extends Libro{
	 public TestLibroVocabolario(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
	Libro b;
	b = new Libro(1500);
	System.out.println("*********\n* LIBRO *\n*********");
	b.pageMessage();
	b = new Vocabolario(1500,52500);
	System.out.println("***************\n* VOCABOLARIO *\n***************");
	// il comando:
	// b.definitionMessage();
	// darebbe un errore in compilazione:
	// b è una variabile di tipo Libro, ma definitionMessage()
	// un metodo della sottoclasse Vocabolario
	// dato che il "tipo effettivo" di b è Vocabolario, possiamo fare
	// un cast:
	((Vocabolario) b).definitionMessage();
	 }
	}