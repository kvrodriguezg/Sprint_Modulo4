package Entities;

public class Accidente {
	
	//Declaracion de atributos.
	private int id_accidente;
	private int rut_cliente;
	private String hora;
	private String dia;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	//Constructor con parámetros.
	public Accidente(int id_accidente, int rut_cliente, String hora, String dia, String lugar, String origen,
			String consecuencias) {
		super();
		this.id_accidente = id_accidente;
		this.rut_cliente = rut_cliente;
		this.hora = hora;
		this.dia = dia;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	//Constructor sin parámetros.
	public Accidente() {
		super();
	}

	//Métodos Get y Set.
	public int getId_accidente() {
		return id_accidente;
	}

	public void setId_accidente(int id_accidente) {
		this.id_accidente = id_accidente;
	}

	public int getRut_cliente() {
		return rut_cliente;
	}

	public void setRut_cliente(int rut_cliente) {
		this.rut_cliente = rut_cliente;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	//Método toString
	@Override
	public String toString() {
		return "Accidente [id_accidente=" + id_accidente + ", rut_cliente=" + rut_cliente + ", hora=" + hora + ", dia="
				+ dia + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}
}
