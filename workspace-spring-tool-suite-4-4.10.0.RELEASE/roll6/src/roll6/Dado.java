package roll6;

import java.util.Random;

public class Dado {
	
	// Metodo Costruttore inizializzato con il numero di facce del dado
	  public Dado(int s)
	  {
	    facce = s;
	    // Generatore di numeri casuali
	    generatore = new Random();
	  }

	 
	  // Metodo che simula il lancio del dado
	  public int lancia()
	  {
	      return 1 + generatore.nextInt(facce);
	  }

	  
	  public void somma() {
		  System.out.println("La somma del lancio è: " );
		
		}
	  

	  private Random generatore;
	  private int facce;
	}


