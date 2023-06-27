package Containers;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import Entities.Profesional;
import Entities.Usuario;
import Interface.Asesoria;

public class Profesional_Container  extends Container implements Asesoria{

	Profesional prof = new Profesional();
	static Scanner reader = new Scanner(System.in);
	
	//Constructor con parámetros.
	public Profesional_Container(Profesional prof) {
		this.prof = prof;
	}
	
	//Constructor sin parámetros.
	public Profesional_Container() {	}

	//Método analizar usuario, utilizando el método ToString para desplegar datos de Profesional.
	@Override
	public String analizarUsuario() {
		
		return prof.toString();
	}
	
	//Método para añadir usuario del tipo profesional.
	public Profesional_Container(List<Usuario> lista) {
		
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
		prof.setRun(Integer.parseInt(num));
		
		System.out.println("Ingresar Nombre de usuario:");
		String nombre = reader.nextLine();
		while( nombre.length()<10 || nombre.length()>50)
		{
			System.out.println("Nombre debe contener entre 10 y 50 caracteres. Ingrese nuevamente:");
			nombre = reader.nextLine();
		}
		prof.setNombre(nombre);
		
		System.out.println("Ingrese fecha de nacimiento:");
		String fecha = reader.nextLine();
		while(!validarFecha(fecha))
		{
			System.out.println("Formato de fecha debe ser DD/MM/AAAA. Ingrese nuevamente:");
			fecha = reader.nextLine();
		}
		prof.setFecha_nac(fecha);
			
		System.out.println("Ingrese titulo:");
		String titulo = reader.nextLine();
		while( titulo.length()<10 || titulo.length()>50)
		{
			System.out.println("Titulo debe contener entre 10 y 50 caracteres. Ingrese nuevamente:");
			titulo = reader.nextLine();
		}
		prof.setTitulo(titulo);
		
		System.out.println("Ingrese fecha de ingreso:");
		fecha = reader.nextLine();
		while(!validarFecha(fecha))
		{
			System.out.println("Formato de fecha debe ser DD/MM/AAAA. Ingrese nuevamente:");
			fecha = reader.nextLine();
		}
		prof.setFecha_ingreso(fecha);
		
		lista.add(prof);
	}

}
