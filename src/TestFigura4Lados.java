import java.util.Scanner;

public class TestFigura4Lados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce los lados de una figura regular de 4 lados");
		Scanner sc = new Scanner(System.in);
		int lado1 = 0, lado2 = 0;
		if (sc.hasNextInt()) {
			lado1 = sc.nextInt();
		}
		if (sc.hasNextInt()) {
			lado2 = sc.nextInt();
		}
		sc.close();
		if( lado1 <= 0 || lado2 <= 0) {
			System.out.println("Valores no permitido");
			return;
		}
		String figura = Figura4Lados.obtenerTipoFigura(lado1, lado2);
		if (figura == "Cuadrado")
			System.out.printf("%s de lado %d, de perímetro %d, de área %d y diagonal %.2f%n",
					figura, lado1, Figura4Lados.calcularPerimetro(lado1, lado2), 
					Figura4Lados.calcularArea(lado1, lado2), 
					Figura4Lados.calcularDiagonal(lado1, lado2));
		else
			System.out.printf("%s de lado1 %d, lado2 %d,de perímetro %d, de área %d y diagonal %.2f%n",
					figura,lado1, lado2, Figura4Lados.calcularPerimetro(lado1, lado2), 
					Figura4Lados.calcularArea(lado1, lado2), 
					Figura4Lados.calcularDiagonal(lado1, lado2));

	}

}
