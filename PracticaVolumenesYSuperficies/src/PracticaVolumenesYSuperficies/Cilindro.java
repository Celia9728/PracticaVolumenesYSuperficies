package PracticaVolumenesYSuperficies;

/**
 * Clase de un cilindro que calcula la superficie y el volumen
 */
public class Cilindro {
	public double radio;
	public double altura;

	/**
	 * Constructor del cilindro donde le damos el valor de 1 de radio y altura
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}

	/**
	 * Constructor para crear un cilindro donde recibe por parametro el radio y
	 * altura.
	 * 
	 * @param radio
	 * @param altura
	 */
	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	/**
	 * Metodo para calcular la superficie del cilindro
	 * 
	 * @return double
	 */
	public double superficie() {
		double resultado = (2 * 3.14 * this.radio * this.radio) + (2 * 3.14 * this.radio * this.altura);
		return resultado;
	}

	/**
	 * Metodo para calcular el volumen del cilindro
	 * 
	 * @return dobule
	 */
	public double volumen() {
		double area = 3.14 * this.radio * this.radio;
		double volumen = area * this.altura;
		return volumen;
	}
}
