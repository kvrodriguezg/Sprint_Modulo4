package Containers;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import Interface.Asesoria;
import Entities.Administrativo;
import Entities.Usuario;

public class Administrativo_Container extends Container implements Asesoria{

	Administrativo admin = new Administrativo();
	static Scanner reader = new Scanner(System.in);
		
	//Constructor con parámetros.
	public Administrativo_Container(Administrativo admin) {
		super();
		this.admin = admin;
	}
	
	//Constructor sin parámetros.
	public Administrativo_Container() {	}

	//Método analizar usuario, utilizando el método ToString para desplegar datos de administrativo.
	@Override
	public String analizarUsuario() {
		return admin.toString();
	}
	
	//Método para añadir usuario del tipo administrativo. Se validan datos.
	public Administrativo_Container(List<Usuario> lista) {
		
		String num = "";
		System.out.println("Ingrese RUN de usuario:");
		num =reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		while(validarRut(Integer.parseInt(num)))
		{
			System.out.println("RUN no debe superar los 99.999.999. Ingrese nuevamente:");
			num =reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Debe ingresar solo números validos.");
				num =reader.nextLine();
			}
		}
		admin.setRun(Integer.parseInt(num));
		

		System.out.println("Ingrese Nombre de usuario:");
		String nombre = reader.nextLine();
		while( nombre.length()<10 || nombre.length()>50)
		{
			System.out.println("Nombre debe contener entre 10 y 50 caracteres. Ingrese nuevamente:");
			nombre = reader.nextLine();
		}
		admin.setNombre(nombre);	
		
		System.out.println("Ingrese fecha de nacimiento:");
		String fecha = reader.nextLine();
		while(!validarFecha(fecha))
		{
			System.out.println("Formato de fecha debe ser DD/MM/AAAA. Ingrese nuevamente:");
			fecha = reader.nextLine();
		}
		admin.setFecha_nac(fecha);
		
		System.out.println("Ingrese área:");
		String area = reader.nextLine();
		while( area.length()<5 || nombre.length()>20)
		{
			System.out.println("Área debe contener entre 5 y 20 caracteres. Ingrese nuevamente:");
			area = reader.nextLine();
		}
		admin.setArea(area);
		
		System.out.println("Ingrese experiencia previa:");
		admin.setExp_previa(reader.nextLine());
		
		lista.add(admin);
	}
	
}
