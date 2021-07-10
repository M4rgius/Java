package esercitazioneOOP;


//Esempio 2

public class PersonaTesting {
	
	public static void main(String[] args) {
		Persona p=new Persona("Vincenzo", "Coniglio",33 ); //costruttore con parametri
		Persona p1=new Persona();//utlizzo il costruttore di default
		Persona p2= new Persona(p); //utilizzo il costruttore di coppia
		
		p.stampa();
		p2.stampa();
		
		p2.setNome("Vito");
		
		p.stampa();
		p2.stampa();
		
		System.out.println(p2);
		
		Studente s=new Studente("Marcellino", "Improta", 27, 007, 25.0);
		System.out.println(s.getNome());
		
		Persona p3=new Studente("nome", "cognome", 55, 001, 18.8);
		//Studente s3=new Persona();
		((Studente)p3).getMatricola();
		
		
	}

}
