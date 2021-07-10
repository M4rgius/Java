package nomi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LeggiNomi {
	// Percorso file
	static String percorso = System.getProperty("user.home") + "/Desktop/nomi_italiani.txt";
	// lista nomi
	static LinkedList<String> listaNomi = new LinkedList<String>();

	public static void main(String[] args) {

		// scanner
		Scanner scan = new Scanner(System.in);
		
		// Variabile per contenere il nome
		String nome = " ";

		try {
			// file
			File file = new File(percorso);
			// reader
			FileReader fr = new FileReader(file);
			// buffer
			BufferedReader br = new BufferedReader(fr);

			// leggo il file fin quando non leggo null e lo salvo nella lista
			while (nome != null) {
				nome = br.readLine();
				if (nome != null) {

					listaNomi.add(nome);

				}
			}

			// cerco il nome, se presente ne stampo la posizione
			int scelta = 0;
			boolean found;
			do {
			
				System.out.print("Nome da cercare: ");
				nome = scan.next();

				found = false;
				for (int i = 0; i < listaNomi.size() && found == false; i++) {

					if (listaNomi.get(i).equals(nome)) {
						System.out.println("Nome presente in posizione: " + i);
						found = true; // se found = true esco dal ciclo, evitando iterazioni extra
					}
				}
				if (found == false) {
					System.out.println("Nome non presente");
				} 
				

				System.out.println("Vuoi continuare? 0 = si  | 1 = no");
				scelta = scan.nextInt();
			} while (scelta == 0);

			// chiudo il buffer
			br.close();
		} catch (IOException e) {// catturo l'eccezione
			e.printStackTrace();// gestisco l'eccezione

		}

	}

}