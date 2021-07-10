
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//DESCRIZIONE
//Programma che simula il gioco della tombola tra n-giocatori e stampa il vincitore.
//
//Al fine di rendere il programma efficiente, ho scelto di regolare le estrazioni 
//in base all'ordinamento di 90 numeri generati casualmente: ciascuna cella dell'array 
//(che è il (numero estratto -1)) viene riempita con un numero casuale intero.
//Così facendo, non ho bisogno di controllare che venga pescato lo stesso numero due volte, 
//dato che la probabilità che in 90 richieste, 'Random()' generi due numeri uguali interi 
//è infinitesima. 
//
//Il programma richiede da 'input' il solo numero di giocatori e come 'output' informa l'utente 
//del vincitore, dei numeri che lo hanno fatto vincere, del numero di estrazioni avvenute 
//e della quantità di numeri che servivano ai giocatori perdenti per fare tombola. 

public class Tombola {
	
	public static int[] estrazioneNumeri() {
		int[] estrazione = new int[90];
		int[] array = new int[90];
		Random random = new Random();
		int temp = 0;
		
		for(int i=0; i<90; i++) {
			   estrazione[i] = i+1;
			   array[i] = random.nextInt();	  
		}
		
		for(int i=0; i<89; i++) {
			for(int j=89; j>i; j--) {
				if(array[j]<array[j-1]) {	
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;	
									
					temp = estrazione[j];
					estrazione[j] = estrazione[j-1];
					estrazione[j-1] = temp;					
				}	
			}
		}
		
		return estrazione; 
	}
	
	public static int[][] creazioneCartelle(int giocatori) {
		Random random = new Random();
		
		int[][] giocata = new int [giocatori][15];
		
		for(int i=0; i<giocatori; i++) {
			for(int j=0; j<15; j++) {
				do {
					giocata[i][j] = random.nextInt(91);
				} while(giocata[i][j]==0);		
			}
		} 
		
		return giocata;
	}
	
	public static void risultato(int giocatori, int[] estrazione, int[][] giocata) {
		int[] count = new int[giocatori];
		
		for(int i=0; i<giocatori; i++) {
			count[i] = 15;
		}
		
		punto_uscita: for(int i=0; i<90; i++) {
			for(int j=0; j<giocatori; j++) {
				for(int k=0; k<15; k++) {
					if(estrazione[i]==giocata[j][k]) {
						count[j] --;
					}
				} if(count[j] == 0) {
					System.out.println("Il giocatore "+ j +" ha vinto con i seguenti numeri: ");
					System.out.println(Arrays.toString(giocata[j]));
					System.out.println("La tombola è avvenuta all'estrazione del "+ (i+1) +" numero!");
					break punto_uscita;
				}
			}
	}
		for(int i=0; i<giocatori; i++) {
			if(count[i] != 0) {
			System.out.println("Al giocatore "+ i +" mancavano "+ count[i]+" numeri per vincere!");
		  }
		}
	}

	
	public static void main(String[] args) {
		
		int[] estrazione = new int[90];
		int giocatori = 0;
        Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire il numero dei giocatori: ");
		giocatori = input.nextInt();
			
		int[][] giocata = new int[giocatori][15];
		
		estrazione = estrazioneNumeri();
		giocata = creazioneCartelle(giocatori);
		risultato(giocatori, estrazione, giocata);
		
		input.close();
	}


	

}
