package Entities;

public class Visita_en_Terreno {

	//Declaración de atributos.
	private int id_visitaterreno;
	private int rut_cliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	//Constructor con parámetros.
	public Visita_en_Terreno(int id_visitaterreno, int rut_cliente, String dia, String hora, String lugar,
			String comentarios) {
		this.id_visitaterreno = id_visitaterreno;
		this.rut_cliente = rut_cliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}
	
	
	//Constructor sin parámetros.
	public Visita_en_Terreno() {
	
	}

	//Métodos Get y Set.
	public int getId_visitaterreno() {
		return id_visitaterreno;
	}

	public void setId_visitaterreno(int id_visitaterreno) {
		this.id_visitaterreno = id_visitaterreno;
	}

	public int getRut_cliente() {
		return rut_cliente;
	}

	public void setRut_cliente(int rut_cliente) {
		this.rut_cliente = rut_cliente;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	
	//Método toString.
	@Override
	public String toString() {
		return "Visita_en_Terreno [id_visitaterreno=" + id_visitaterreno + ", rut_cliente=" + rut_cliente + ", dia="
				+ dia + ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	} 

}
