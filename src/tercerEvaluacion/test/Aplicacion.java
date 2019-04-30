package tercerEvaluacion.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import tercerEvaluacion.clases.Auxiliar;
import tercerEvaluacion.clases.Demografia;
import tercerEvaluacion.clases.DemografiaDAO;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DemografiaDAO dao = null;
		try {
			dao = new DemografiaDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Introduce código postal válida");
		String codigo;
		do {
			codigo = sc.next();
//			if (Auxiliar.comprobarCodigoPostal(codigo))
//				break;
		} while (!Auxiliar.comprobarCodigoPostal(codigo));
		System.out.println(dao.borrarMunicipio(codigo));
		List<Demografia> lista = dao.obtenerMunicipiosPorNacimientos(40, 50);
		for (Demografia demografia : lista) {
			System.out.printf("Nombre municipio: %S, edad media: %d, nacimientos: %d, defunciones %d%n",
					demografia.getNombreMunicipio(), demografia.getEdadMedia(), 
					demografia.getNacimientos(), demografia.getDefunciones());
					;
		}
		Map< String, Demografia > coleccion = dao.obtenerDatosDemograficos();
		try {
			Auxiliar.volcarDatosFichero(coleccion);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}

	}
