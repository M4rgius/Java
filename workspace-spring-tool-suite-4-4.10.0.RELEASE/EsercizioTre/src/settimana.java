import java.util.Scanner;

public class settimana {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int scelta = 0;
		do {

			System.out.println("Scegli un numero da 1 a 7 ");

			scelta = input.nextInt();
		} while (scelta < 1 || scelta > 7);

		switch (scelta) {
		case 1:
			System.out.println("Lunedì");
			break;

		case 2:
			System.out.println("Martedì");
			break;

		case 3:
			System.out.println("Mercoledì");
			break;

		case 4:
			System.out.println("Giovedì");
			break;

		case 5:
			System.out.println("Venerdì");
			break;

		case 6:
			System.out.println("Sabato");
			break;

		case 7:
			System.out.println("Domenica");
			default:

		}

		System.out.println("Il giorno è " + scelta);

	}

}
