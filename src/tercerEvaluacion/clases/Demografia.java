package tercerEvaluacion.clases;

public class Demografia {
 /*
  * municipio text not null,
edadMedia integer not null,
nacimientos integer not null,
defunciones integer not null
  */
	
	private String nombreMunicipio;
	private int edadMedia;
	private int nacimientos;
	private int defunciones;
	
	public Demografia(String nombreMunicipio, int edadMedia, int nacimientos, int defunciones) {
		this.nombreMunicipio = nombreMunicipio;
		this.edadMedia = edadMedia;
		this.nacimientos = nacimientos;
		this.defunciones = defunciones;
	}
	public String getNombreMunicipio() {
		return nombreMunicipio;
	}
	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}
	public int getEdadMedia() {
		return edadMedia;
	}
	public void setEdadMedia(int edadMedia) {
		this.edadMedia = edadMedia;
	}
	public int getNacimientos() {
		return nacimientos;
	}
	public void setNacimientos(int nacimientos) {
		this.nacimientos = nacimientos;
	}
	public int getDefunciones() {
		return defunciones;
	}
	public void setDefunciones(int defunciones) {
		this.defunciones = defunciones;
	}
	@Override
	public String toString() {
		return String.format("%S,%d,%d,%d",
				nombreMunicipio, edadMedia, nacimientos, defunciones);
	}
	
	
}
