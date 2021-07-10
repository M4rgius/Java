package dado;

import java.util.Scanner;

public class DadoTesting {
	
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
		
		
	Dado d6 = new Dado();
	Dado d20= new Dado(20);
	
	int numeroLanci= 0;
	int numeroFacce=0;
	
	System.out.println("Inserire numero facce: ");
	numeroFacce=scan.nextInt();
	
	Dado dx= new Dado(numeroFacce);
	System.out.println("Inserire numero lanci: ");
	numeroLanci = scan.nextInt();
	
	for(int i=0; i<numeroLanci; i++) {
		System.out.println(i+1+"Lancio: " +d6.lancioDado());
		System.out.println(i+1+"Lancio "+dx.lanciaDadoMath());
	}
		
	
	

}}
