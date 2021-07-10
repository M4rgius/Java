package nomi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class CopiaAlContrario {
	// Percorso lettura
	static String percorsoLettura = System.getProperty("user.home") + "/Desktop/nomi_italiani.txt";
	// Percorso scrittura
	static String percorsoScrittura = System.getProperty("user.home") + "/Desktop/nomiReverse.txt";
	// lista nomi
	static LinkedList<String> listaNomi = new LinkedList<String>();

	public static void main(String[] args) {

		// leggo il file e lo salvo nella lista
		try {
			// file
			File file = new File(percorsoLettura);
			// reader
			FileReader fr = new FileReader(file);
			// buffer
			BufferedReader br = new BufferedReader(fr);

			String nome = " ";

			// leggo il file fin quando non leggo null e lo salvo nella lista
			while (nome != null) {
				nome = br.readLine();
				if (nome != null) {

					listaNomi.add(nome);

				}
			}

			// chiudo il buffer
			br.close();
		} catch (IOException e) {// catturo l'eccezione
			e.printStackTrace();// gestisco l'eccezione

		}

		// Copio la lista al contrario
		try {
			// file
			File file = new File(percorsoScrittura);
			// reader
			FileWriter fw = new FileWriter(file);
			// buffer
			BufferedWriter bw = new BufferedWriter(fw);

			String nome;

			for (int i = listaNomi.size() - 1; i >= 0; i--) {
				nome = i + "  " + listaNomi.get(i) + "\n";
				bw.write(nome);
			}

			// chiudo il buffer
			bw.close();
		} catch (IOException e) {// catturo l'eccezione
			e.printStackTrace();// gestisco l'eccezione

		}

	}

}