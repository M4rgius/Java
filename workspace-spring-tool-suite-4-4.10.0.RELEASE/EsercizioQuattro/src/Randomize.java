import java.util.Arrays;
import java.util.Random;

public class Randomize {

	// prima opzione ma non restituisce il valore nell'array(da fixare)
	/*
	 * public static void main(String[] args) { System.out.println(); int[]
	 * randomArray = new int[5]; for(int i=0; i<randomArray.length;i++)
	 * randomArray[i]= (int) (Math.random()*100);
	 * 
	 * 
	 * for(int i=0; i<randomArray.length; i++) System.out.println(randomArray[i]);
	 * 
	 * }
	 */

	// seconda opzione

	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayRandom = new int[5];
		for (int i = 0; i < 5; i++) {
			int numRandomInt = random.nextInt(101);
			arrayRandom[i] = numRandomInt;
		}
		System.out.println(Arrays.toString(arrayRandom));

	}

}
