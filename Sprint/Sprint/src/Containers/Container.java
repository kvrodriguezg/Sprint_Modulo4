package Containers;

import java.util.Scanner;

public class Container {

	static Scanner reader = new Scanner(System.in);
	public void mostrar() {

	}

	//Mensaje inicia con constructor.
	public Container() {
		System.out.println("Complete datos:");
	}

	//Método para validar formato de fecha.
	public Boolean validarFecha(String texto) {
	
		return texto.matches("^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]([012][0-9][0-9][0-9])$");
	}
	
	//Método para validar formato de hora.
		public Boolean validarHora(String texto) {
		
			return texto.matches("^([0-1][0-9]|[2][0-3])[:]([0-5][0-9])$");
		}
	
	//Método para validar solo ingreso de números.
	public static Boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	//Método para validar RUT mayor a 99.999.999.
	public static Boolean validarRut(int rut)
	{
		if(rut>99999999 ) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
