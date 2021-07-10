package rettangolo;

public class Rettangolo {

	private double base;
	private double altezza;
	private double ascissa;
	private double ordinata;

	public Rettangolo(double base, double altezza, double ascissa, double ordinata) {

		this.base = base;
		this.altezza = altezza;
		this.ascissa = ascissa;
		this.ordinata = ordinata;

	}

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
		ascissa = 0;
		ordinata = 0;
	}

	public Rettangolo() {
		base = 0;
		altezza = 0;
		ascissa = 0;
		ordinata = 0;

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getAscissa() {
		return ascissa;
	}

	public void setAscissa(double ascissa) {
		this.ascissa = ascissa;
	}

	public double getOrdinata() {
		return ordinata;
	}

	public void setOrdinata(double ordinata) {
		this.ordinata = ordinata;
	}

	public void sposta(double ascissa1, double ordinata1) {
		this.ascissa += ascissa1;
		this.ordinata += ordinata1;
		System.out.println("Il nuovo triangolo è stato spostato in :  [" + this.ascissa + " , " + this.ordinata + "]");

	}

	public void perimetro() {
		System.out.println("Perimetro: " + 2 * (this.base + this.altezza));
	}

	public void area() {
		System.out.println("L'area è : " + this.base * this.altezza);
	}

	public void stampa() {
		System.out.println("La base è " + this.getBase() + " altezza " + this.altezza + " ascissa " + this.ascissa
				+ " ordinata " + this.ordinata);
	}

}
