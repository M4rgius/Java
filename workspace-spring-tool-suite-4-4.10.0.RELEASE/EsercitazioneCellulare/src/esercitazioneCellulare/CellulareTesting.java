package esercitazioneCellulare;

import java.util.Scanner;

public class CellulareTesting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double durataChiamata = 0;
		double ricarica = 0;
		// Creo un cellulare con 10€ di carica
		Cellulare cel = new Cellulare(10);

		int scelta = 0;
		do {

			// Stampo possibili scelte
			do {

				System.out.println("1) Visualizza credito.");
				System.out.println("2) Visualizza numero chiamate.");
				System.out.println("3) Effettua chiamata.");
				System.out.println("4) Effettua ricarica.");
				System.out.println("5) Azzera chiamate.");
				System.out.println("6) Esci.");

				System.out.print("Inserire scelta:");
				scelta = scan.nextInt();

				if (scelta < 1 || scelta > 6) {
					System.out.println("Inserisci una scelta valida.");
				}

			} while (scelta < 1 || scelta > 6);

			// Switch case per operazione da eseguire
			switch (scelta) {
			case 1: // Visualizza credito.
				System.out.println("Il credito attuale è di: " + cel.numero404() + "€\n");
				break;
			case 2: // Visualizza numero chiamate.
				System.out.println("Hai effettuato: " + cel.getNumeroChiamate() + " chiamate.\n");
				break;
			case 3: // Effettua chiamata.
				boolean ok; // flag per effettuare una chiamata valida
				do {
					ok = true;
					// effettuo chiamata dopo aver validato l'input
					System.out.print("Inserire durata chiamata (tariffa: 0.20€ al minuto): ");
					durataChiamata = scan.nextDouble();

					if ((durataChiamata * 0.2) > (cel.numero404())) { // se il costo della chiamata desiderata supera il
																		// credito disponibile, non posso effettuare la
																		// chiamata
						System.out.println("Credito insufficiente per effettuare la chiamata. Ricaricare!\n\n");
						ok = false;// ok = false, credito insuff.
					} else {// else il credito è sufficiente, effettuo la chiamata ed imposto il flag su
							// true per uscire dal do-while
						cel.chiama(durataChiamata);
						ok = true;
						String addebito = String.format("%.2f", (durataChiamata * 0.2)); // String.format per poter
																							// stampare solo i primi due
																							// decimali del double
																							// (%.2f)
						System.out.println("Chiamata effettuata, saranno sottratti: " + addebito + "€\n");
					}

				} while (durataChiamata < 1 && ok == false); // Ripeto fin quando la durata sarà almeno di 1 minuto O il
																// flag ok sarà su true

				break;
			case 4: // Effettua ricarica.
				do {
					// effettuo una ricarica dopo aver validato l'input
					System.out.print("Inserire l'importo della ricarica (min 5€): ");
					ricarica = scan.nextDouble();
					if (ricarica < 5) {
						System.out.println("Importo troppo basso.");
					} else if (ricarica < 100) {
						System.out.println("Importo troppo alto.");
					}
				} while (ricarica < 5 || ricarica > 100);
				cel.ricarica(ricarica);
				System.out.println("Ricarica Effettuata.\n");
				break;
			case 5: // Azzera chiamate.

				System.out.println("Numero Chiamate azzerato.\n");
				cel.azzeraChiamate();
				break;
			}

		} while (scelta != 6); // Continuo a mostrare il menu finquando la scelta sarà valida, ossia
								// compresa tra 1 e 5

		// Fine del programma
		System.out.println("\nArrivederci.");
		scan.close();
	}
}
