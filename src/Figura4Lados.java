/**
 * Clase que contiene mñétodos relacionados con figuras como el
 * rectángulo o el cuadrado
 * @author Manuel M.
 * @version 1.0.0
 */
public class Figura4Lados {
	
	/** Método que dice el tipo de figura
	 * @param lado1
	 * @param lado2
	 * @return Una cadena con "Cuadrado" o "Rectángulo"
	 */
	public static String obtenerTipoFigura (int lado1, int lado2) {
		if (lado1 == lado2)
			return "Cuadrado";
		else
			return "Rectángulo";
	}
	
	/** Método que calcula el perímetro de la figura
	 * @param lado1
	 * @param lado2
	 * @return lado1 + lado1 + lado2 + lado2
	 */
	public static int calcularPerimetro(int lado1, int lado2) {
		/*int resultado;
		resultado = lado1 + lado1 + lado2 + lado2;
		return resultado;*/
		return lado1 + lado1 + lado2 + lado2;
	}
	
	/** Método que calcula el área de la figura de 4 lados
	 * @param lado1
	 * @param lado2
	 * @return area = lado1 * lado2
	 */
	public static int calcularArea(int lado1, int lado2) {
		return lado1 * lado2;
	}
	
	/** Método que devuelve la diagonal de la figura de 4 lados
	 * @param lado1
	 * @param lado2
	 * @return diagonal de la figura
	 */
	public static float calcularDiagonal(int lado1, int lado2) {
		return (float) Math.sqrt(lado2 * lado2 + lado1 * lado1);
	}
	
	
	
	
	
	
	
	
	
	

}
