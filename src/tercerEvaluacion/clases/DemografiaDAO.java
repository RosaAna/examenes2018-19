package tercerEvaluacion.clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemografiaDAO {
	Connection conexion;
	public DemografiaDAO() throws SQLException {
		conexion = Conexion.getConexion();
	}
	
	public Map< String, Demografia > obtenerDatosDemograficos(){
		Map<String, Demografia> coleccion = new HashMap<>();
		String sql = "select * from demografia ;";
		try (Statement sentencia = conexion.createStatement();) {
			ResultSet resultado = sentencia.executeQuery(sql);
			while (resultado.next()) {
				String clave = resultado.getString("codigo");
				Demografia demografia = new Demografia(
						resultado.getString("municipio"), resultado.getInt("edadMedia"),
						resultado.getInt("nacimientos"), resultado.getInt("defunciones"));
				coleccion.put(clave, demografia);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coleccion;
	}
	
	public List<Demografia> obtenerMunicipiosPorNacimientos(int inicio, int fin){
		List<Demografia> lista = new ArrayList<>();
		//sqlite> select * from demografia where nacimientos BETWEEN 40 and 50;
		String sql = "select * from demografia where nacimientos BETWEEN ? and ?;";
		try (PreparedStatement sentencia = conexion.prepareStatement(sql);
){
			sentencia.setInt(1, inicio);
			sentencia.setInt(2, fin);
			ResultSet resultado = sentencia.executeQuery();
			while(resultado.next()) {
				lista.add(new Demografia(
						resultado.getString("municipio"), resultado.getInt("edadMedia"),
						resultado.getInt("nacimientos"), resultado.getInt("defunciones")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public boolean borrarMunicipio (String codigo) {
		int filas = 0;
		String sql = "DELETE FROM demografia WHERE codigo = ?;";
		try (PreparedStatement sentencia = conexion.prepareStatement(sql);
){
			sentencia.setString(1, codigo);
			filas = sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas != 0;
	}
	
	public static void main(String[] args) throws SQLException {
		DemografiaDAO dao = new DemografiaDAO();
		System.out.println(dao.borrarMunicipio("23044"));
		List<Demografia> lista = dao.obtenerMunicipiosPorNacimientos(40, 50);
		lista.forEach(m -> System.out.println(m));
		lista.forEach(System.out::println);
		for (Demografia municipio : lista) {
			System.out.println(municipio);
		}

	}
}
