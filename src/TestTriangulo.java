import java.util.Scanner;

public class TestTriangulo {
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Introduce tres lados");
	     int lado1 = sc.nextInt();
	     int lado2 = sc.nextInt();
	     int lado3 = sc.nextInt();
	     sc.close();
	     
	     if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
	    	 System.out.println("No aceptamos lados negativos");
	    	 System.exit(1);
	     }
	     
	     if (!Triangulo.esTriangulo(lado1, lado2, lado3)) {
	    	 System.out.println("No es posible construir el triángulo");
	    	 System.exit(2);
	     }
	     
	     System.out.printf("Triángulo, rectangulo: %B, isosceles: %B, "
	     		+ "equilatero: %B, perímetro: %d%n", Triangulo.esRectangulo(lado1, lado2, lado3),
	     		Triangulo.esIsosceles(lado1, lado2, lado3), Triangulo.esEquilatero(lado1, lado2, lado3),
	     		Triangulo.calcularPerimetro(lado1, lado2, lado3));
	     
	
	}
}
