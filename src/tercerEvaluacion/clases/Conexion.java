package tercerEvaluacion.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion;
	
	private Conexion() {}
	
	public static Connection getConexion() throws SQLException {
		String url = "jdbc:sqlite:database/datosDemograficos.db";
		if (conexion == null) {
			conexion = DriverManager.getConnection(url);
		}
		return conexion;
	}
	
	public static void cerrarConexion() throws SQLException {
		if (conexion != null) //prevención NullPointerException
			conexion.close();
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getConexion());
		System.out.println(getConexion());
		cerrarConexion();

	}
}
