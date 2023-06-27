package Entities;

public class Capacitacion {
	
	//Declaracion de atributos.
	private int id_cap;
	private int rut;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cant_a;
	
	//Constructor con parámetros.
	public Capacitacion(int id_cap, int rut, String dia, String hora, String lugar, String duracion, int cant_a) {
		this.id_cap = id_cap;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cant_a = cant_a;
	}
	
	//Constructor sin parámetros.
	public Capacitacion() {
		
	}

	//Métodos Get y Set.
	public int getId_cap() {
		return id_cap;
	}


	public void setId_cap(int id_cap) {
		this.id_cap = id_cap;
	}


	public int getRut() {
		return rut;
	}


	public void setRut(int rut) {
		this.rut = rut;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public int getCant_a() {
		return cant_a;
	}


	public void setCant_a(int cant_a) {
		this.cant_a = cant_a;
	}

	//Método toString.
	@Override 
	public String toString() {
		return "Capacitación [id_cap=" + id_cap + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar="
				+ lugar + ", duracion=" + duracion + ", cant_a=" + cant_a + "]";
	}

}
