package esercizioDipendente;

public class DipendenteTester {

	public static void main(String[] args) {
		// Creo un oggetto di classe Dipendente, lo chiamo d.
		Dipendente d = new Dipendente();
		// Imposto un nome a d.
		d.setNome("Andrea");
		// Inserisco il valore dello stipendio.
		d.setStipendio(1500.0);
		// Incremento del X lo stipendio.
		d.aumento(20.0);
		// Stampo il nome e lo stipendio del dipendente.
		System.out.println(d.getNome() + " = " + d.getStipendio());

		// Creo un altro oggetto di classe Dipendente, lo chiamo a.
		Dipendente a = new Dipendente("Mario", 1800);
		// Incremento del X lo stipendio.
		a.aumento(10.0);
		// Stampo il nome e lo stipendio del dipendente.
		System.out.println(a.getNome() + " = " + a.getStipendio());
	}
}
