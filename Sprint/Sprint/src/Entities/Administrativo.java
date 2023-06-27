package Entities;

public class Administrativo extends Usuario {
	
	//Declaracion de atributos.
	private String area;
	private String exp_previa;
	
	//Constructor con parámetros.
	public Administrativo(String nombre, int run, String fecha_nac, String area, String exp_previa) {
		super(nombre, run, fecha_nac);
		this.area = area;
		this.exp_previa = exp_previa;
	}

	//Constructor sin parámetros.
	public Administrativo() {}

	//Métodos Get y Set.
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExp_previa() {
		return exp_previa;
	}

	public void setExp_previa(String exp_previa) {
		this.exp_previa = exp_previa;
	}

	//Método toString
	@Override 
	public String toString() {
		return "Administrativo [run "+ getRun() + ", nombre="+ getNombre() +", area=" + area + ", exp_previa=" + exp_previa + "]";
	}


}
