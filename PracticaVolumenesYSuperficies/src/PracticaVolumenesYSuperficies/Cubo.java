package PracticaVolumenesYSuperficies;

/**
 * Clase para calcular la superficie y el volumen de un cubo.
 */
public class Cubo {

	public int lado;

	/**
	 * Constructor para crea un cubo con lado de 1.
	 */
	public Cubo() {
		this.lado = 1;
	}

	/**
	 * Constructor para crear un cubo que recibe por paramentro el lado.
	 * 
	 * @param lado
	 */
	public Cubo(int lado) {
		this.lado = lado;
	}

	/**
	 * Metodo para calcular la superficie de un cubo.
	 * 
	 * @return int
	 */
	public int superficie() {
		int area = this.lado * this.lado;
		int superficie = area * 6;
		return superficie;
	}

	/**
	 * Metodo para calcular el volumen de un cubo.
	 * 
	 * @return int
	 */
	public int volumen() {
		return (this.lado * this.lado * this.lado);
	}

}
