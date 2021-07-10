import java.util.Scanner; 


public class operazioni {

	public static double somma(double numero1,double numero2) {
		return numero1+numero2;
	}
	
	public static double sottrazione(double numero1, double numero2) {
		return numero1-numero2;
	}
	
	public static double moltiplicazione(double numero1, double numero2) {
		return numero1*numero2;
	}
	
	public static double divisione(double numero1, double numero2) {
		return numero1/numero2;
	}
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Inserisci primo numero: ");
		double x = input.nextDouble();
		
		System.out.println("Inserisci secondo numero: ");
		double y= input.nextDouble();
		
		System.out.println("Il risultato della somma è " + somma(x,y));
		System.out.println("Il risultato della sottrzione è " + sottrazione(x,y));
		System.out.println("Il risultato della moltiplicazione è " + moltiplicazione(x,y));
		System.out.println("Il risultato della divisione è " + divisione(x,y));
	}
	
}
