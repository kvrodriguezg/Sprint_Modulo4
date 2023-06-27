package Entities;

public class Revision {

	//Declaracion de atributos.
	private int id_revision;
	private int id_visitaterreno;
	private String nombre;
	private String detalle;
	private int estado;
	
	//Constructor con parámetros.
	public Revision(int id_revision, int id_visitaterreno, String nombre, String detalle, int estado) {
		this.id_revision = id_revision;
		this.id_visitaterreno = id_visitaterreno;
		this.nombre = nombre;
		this.detalle = detalle;
		this.estado = estado;
	}

	//Constructor sin parámetros.
	public Revision() {
		super();
	}

	//Métodos Get y Set.
	public int getId_revision() {
		return id_revision;
	}

	public void setId_revision(int id_revision) {
		this.id_revision = id_revision;
	}

	public int getId_visitaterreno() {
		return id_visitaterreno;
	}

	public void setId_visitaterreno(int id_visitaterreno) {
		this.id_visitaterreno = id_visitaterreno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	//Método toString.
	@Override
	public String toString() {
		return "Revision [id_revision=" + id_revision + ", id_visitaterreno=" + id_visitaterreno + ", nombre=" + nombre
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}

}
