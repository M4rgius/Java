package rettangolo;

import java.util.Scanner;

public class RettangoloTesting {

	public static void main(String[] args) {
		Rettangolo p = new Rettangolo(15, 20);

		p.stampa();
		p.area();
		p.perimetro();
		p.sposta(5.6, 15.8);
		System.out.println(p);

		double altezza1, base1;

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il valore della base: ");
		base1 = input.nextInt();
		System.out.println("Inserisci il valore dell'altezza: ");
		altezza1 = input.nextInt();
		Rettangolo p1 = new Rettangolo(base1, altezza1);

		p1.stampa();

		input.close();

	}

}
