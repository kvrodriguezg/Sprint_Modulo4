package Entities;

public class Usuario {

	//Declaracion de atributos.
	private String nombre;
	private int run;
	private String fecha_nac;
	
	//Constructor con parámetros.
	public Usuario(String nombre, int run, String fecha_nac) {
		super();
		this.nombre = nombre;
		this.run = run;
		this.fecha_nac = fecha_nac;
	}
	
	//Constructor sin parámetros.
	public Usuario() {};

	//Métodos Get y Set.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	//Método toString.
	@Override 
	public String toString() {
		return "Usuario [nombre=" + nombre + ", rut=" + run + "]";
	}	
}
