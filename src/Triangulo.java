/**
 * Clase que nos aporta métodos relacionados con la figura 
 * geometrica del triangulo
 * @author Manuel M.
 * @version 1.0.0
 */
public class Triangulo {
	
	/** Método que comprueba la desigualdad triangular
	 * @param lado1 uno de los lados del triángulo
	 * @param lado2 el otro el lado
	 * @param lado3 y el último lado
	 * @return true si y solo si el triangulo satisface la desigualdad triangular
	 */
	
	public static boolean esTriangulo(int lado1, int lado2, int lado3) {
		/*if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) 
				&& (lado1 + lado3 > lado2) == true)
			return true;
		else
			return false;*/
		return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) 
				&& (lado1 + lado3 > lado2);
	}
	
	/** Método que calcula el perímetro del triángulo
	 * @param lado1 uno de los lados del triángulo
	 * @param lado2 el otro el lado
	 * @param lado3 y el último lado
	 * @return el valor del perímetro del triángulo
	 */
	public static int calcularPerimetro(int lado1, int lado2 , int lado3) {
		/*int perimetro = lado1 + lado2 + lado3;
		return perimetro;*/
		return lado1 + lado2 + lado3;
	}
	/** Método que nos dice si el triángulo es equilatero
	 * @param lado1 uno de los lados del triángulo
	 * @param lado2 el otro el lado
	 * @param lado3 y el último lado
	 * @return true si y solo si cuando el triángulo tiene los tres lados iguales
	 */
	public static boolean esEquilatero(int lado1, int lado2, int lado3) {
		//es true si lado1 es igual a lado2 y lado1 es igual a lado3
		/*if   ((lado1 == lado2 && lado1 == lado3) == true)
			return true;
		else 
			return false;*/
		return (lado1 == lado2 && lado1 == lado3);
	}
	
	/** Método que nos dice si el triángulo es isósceles
	 * @param lado1 uno de los lados del triángulo
	 * @param lado2 el otro el lado
	 * @param lado3 y el último lado
	 * @return true si y solo si el triángulo tiene dos lados iguales y otro desigual
	 */
	public static boolean esIsosceles(int lado1, int lado2, int lado3) {
		//es true si lado1 es igual a lado2 y lado1 es distinto que lado3
		//o lado2 es igual a lado3 y lado2 es distinto que lado1 o
		//lado1 igual que lado3 y lado1 distinto que lado2
		/*if (((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1)
		|| (lado1 == lado3 && lado1 != lado2)) == true)
			return true;
		else 
			return false;*/
		return (lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1)
				|| (lado1 == lado3 && lado1 != lado2);
	}
	
	/** Método que nos dice si el triángulo es rectángulo
	 * @param lado1 uno de los lados del triángulo
	 * @param lado2 el otro el lado
	 * @param lado3 y el último lado
	 * @return true si y solo si cuando el triángulo satisface el teorema de pitágoras
	 */
	public static boolean esRectangulo(int lado1, int lado2, int lado3) {
		//hay que averiguar quien es la hipotenusa, que es lado mayor
		//si lado1 es mayor que lado2 y es mayor que lado3, la hipotenusa es lado1
		//si lado2 es mayor que lado1 y es mayor que lado3, la hipotenusa es lado2
		//sino la hipotenusa es lado3
		// si lado1 > lado2 && lado1 > lado3 entonces hipotenusa = lado1
		// si lado2 > lado1 && lado2 > lado3 entonces hipotenusa = lado2
		// sino hipotenusa = lado3
		if (lado1 > lado2 && lado1 > lado3) {
			//hipotenusa lado1
			return lado1 * lado1 == lado2 * lado2 + lado3 * lado3;
		}
		else if (lado2 > lado1 && lado2 > lado3) {
			//hipotenusa es lado2
			return lado2 * lado2 == lado1 * lado1 + lado3 * lado3;
		}
		else {
			//hipotenusa es lado3
			return lado3 * lado3 == lado1 * lado1 + lado2 * lado2;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
