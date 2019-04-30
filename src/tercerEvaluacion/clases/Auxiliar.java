package tercerEvaluacion.clases;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Map;

public class Auxiliar {

	public static boolean comprobarCodigoPostal(String codigo) {
		return codigo.matches("23[0-9]{3}");
	}

	public static void volcarDatosFichero(Map< String, Demografia > coleccion) throws IOException {
		String nombreFichero = "datosDemografia_" + LocalDate.now();
		Path path = Paths.get("ficheros", nombreFichero);
		PrintWriter out = new PrintWriter( 
				Files.newBufferedWriter(path,StandardOpenOption.CREATE));

		for (String clave : coleccion.keySet()) {
			out.println(clave + "," + coleccion.get(clave));
		}
		out.flush();
	}
	public static void main(String[] args) {
		System.out.println(comprobarCodigoPostal("23000"));
		System.out.println(comprobarCodigoPostal("13000"));
		System.out.println(comprobarCodigoPostal("230000"));
		System.out.println(comprobarCodigoPostal("2300"));


	}
}
