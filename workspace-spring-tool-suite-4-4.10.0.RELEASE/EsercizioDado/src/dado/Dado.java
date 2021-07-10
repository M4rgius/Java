package dado;

import java.util.Random;

public class Dado {

	private int facce;

	public Dado(int facce) {
		this.facce = facce;
	}

	public Dado() {
		this.facce = 6;
	}

	public int getFacce() {
		return facce;
	}

	public void setFacce(int facce) {
		this.facce = facce;
	}

	// lancio il dado

	public int lancioDado() {
		Random rand = new Random();

		return 1 + rand.nextInt(facce);

	}

	public int lanciaDadoMath() {
		return ((int) (Math.random() * facce)) + 1;

	}

}
