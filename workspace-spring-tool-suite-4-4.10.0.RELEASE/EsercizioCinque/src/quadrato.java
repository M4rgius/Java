import java.util.Random;
import java.util.Arrays;


public class quadrato {

	public static void main(String[]args) {

		Random random = new Random();
		int[][] array = new int[9][9];
		int somma = 0;
		int sommaDiagonaleSxDx = 0;
		int sommaDiagonaleDxSx = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				array[i][j] = random.nextInt(101);
				somma += array[i][j];
				if (i == j) {
					sommaDiagonaleSxDx += array[i][j];
				} else if (j == (8 - i)) {
					sommaDiagonaleDxSx += array[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Somma degli è " + somma);
		System.out.println("Somma diagonale sx-dx: " + sommaDiagonaleSxDx);
		System.out.println("Somma diagonale dx-sx: " + sommaDiagonaleDxSx);
	}

}
/*
 * Metodo 1 fake int[][] matrix ={ {1, 2, 3, 4}, {4, 8, 3, 2}, {11, 7, 3, 6},
 * {9, 2, 8, 3} };
 * 
 * 
 * int somma = 0; for (int i = 0; i < matrix.length; i++) for (int j = 0; j <
 * matrix[i].length; j++) somma = somma + matrix[i][j];
 * 
 * System.out.println(somma);
 * 
 * 
 * 
 * 
 * }
 */
