package Containers;
import java.util.Scanner;
import java.util.List;

import Interface.Asesoria;
import Entities.Cliente;
import Entities.Usuario;

public class Cliente_Container extends Container implements Asesoria {
	
	static Scanner reader = new Scanner(System.in);
	Cliente cliente = new Cliente();
	
	//Constructor con parámetros.
	public Cliente_Container(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//Constructor sin parámetros.
	public Cliente_Container() {} 
	
	//Método analizar cliente, utilizando el método ToString para desplegar datos de Cliente.
	@Override
	public String analizarUsuario() {
			
		return cliente.toString();
	}
	
	
	//Método que retorna nombres y apellidos de Cliente.
	public String obtenerNombre(String nombres,String apellidos)
	{
		String nombre_completo = nombres + " " + apellidos;
		return nombre_completo;
	}
	
	//Método que despliega el tipo de sistema de salud.
	public void obtenerSistemaSalud(int sis_salud)
	{
;
		if(sis_salud==1)
		{
			System.out.println("FONASA");
		}
		else if (sis_salud==2)
		{
			System.out.println("ISAPRE");
		}
	}
	
	
	//Método para añadir usuario del tipo cliente. Se validan requerimientos.
	public Cliente_Container(List<Usuario> lista) {
		
		int opcion=0;
		
		//Ingreso y validacion de RUN.
		System.out.println("Ingrese RUN de usuario:");		
		String num =reader.nextLine();
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
		cliente.setRun(Integer.parseInt(num));
		
		//Ingreso y validacion de nombre de usuario.
		System.out.println("Ingresar Nombre de usuario:");
		String nombre = reader.nextLine();
		while( nombre.length()<10 || nombre.length()>50)
		{
			System.out.println("Nombre debe contener entre 10 y 50 caracteres. Ingrese nuevamente:");
			nombre = reader.nextLine();
		}
		cliente.setNombre(nombre);
		
		//Ingreso y validacion de fecha de nacimiento.
		System.out.println("Ingrese fecha de nacimiento:");
		String fecha = reader.nextLine();
		while(!validarFecha(fecha))
		{
			System.out.println("Formato de fecha debe ser DD/MM/AAAA. Ingrese nuevamente:");
			fecha = reader.nextLine();
		}
		cliente.setFecha_nac(fecha);
		
		//Ingreso y validacion de nombre de RUT.
		System.out.println("Ingresar RUT de cliente:");
		num =reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		while(validarRut(Integer.parseInt(num)))
		{
			System.out.println("RUN no debe superar los 99.999.999. Ingrese nuevamente:");
			num =reader.nextLine();
		}
		cliente.setRut(Integer.parseInt(num));
		
		
		//Ingreso y validacion de nombres. 
		System.out.println("Ingresar nombres:");
		String nombres = reader.nextLine();
		while( nombres.length()<5 || nombres.length()>30)
		{
			System.out.println("Nombres deben contener entre 5 y 30 caracteres. Ingrese nuevamente:");
			nombres = reader.nextLine();
		}
		cliente.setNombres(nombres);
		
		
		//Ingreso y validacion de apellidos. 
		System.out.println("Ingrese apellidos:");
		String apellidos = reader.nextLine();
		while( apellidos.length()<5 || apellidos.length()>30)
		{
			System.out.println("Apellidos deben contener entre 5 y 30 caracteres. Ingrese nuevamente:");
			apellidos = reader.nextLine();
		}
		cliente.setNombres(apellidos);
		
		//Ingreso y validación de telefono. 
		System.out.println("Ingrese telefono:");
		num = reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		cliente.setTelefono(Integer.parseInt(num));
		
		
		//Ingreso y validacion de afp.
		System.out.println("Ingresar afp:");
		String afp = reader.nextLine();
		while( afp.length()<4 || afp.length()>30)
		{
			System.out.println("AFP debe contener entre 4 y 30 caracteres. Ingrese nuevamente:");
			afp = reader.nextLine();
		}
		cliente.setAfp(afp);
		
		//Ingreso y validación de sistema de salud.
		System.out.println("Ingresar Sistema de Salud:");
		System.out.println("Opción 1: FONASA");
		System.out.println("Opción 2: ISAPRE");
		num = reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos 1 ó 2.");
			num =reader.nextLine();
		}
		opcion=Integer.parseInt(num);
		
		while(opcion!=1 && opcion!=2)
		{
			System.out.println("Opción invalida.");
			System.out.println("Ingresar Sistema de Salud:");
			System.out.println("Opción 1: FONASA");
			System.out.println("Opción 2: ISAPRE");
			num = reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Debe ingresar solo números validos.");
				num =reader.nextLine();
			}
			opcion=Integer.parseInt(num);
		}
		cliente.setSis_salud(opcion);
		reader.nextLine();
		
		//Ingreso y validación de dirección.
		System.out.println("Ingresar dirección:");
		String direccion = reader.nextLine();
		while(direccion.length() > 70 || direccion.length() <=0)
		{
			System.out.println("Dirección no debe superar los 70 caracteres. Ingrese nuevamente:");
			direccion = reader.nextLine();
		}
		cliente.setDireccion(direccion);
		
		//Ingreso y validación de comuna.
		System.out.println("Ingresar comuna:");
		String comuna = reader.nextLine();
		while(comuna.length() > 50 || comuna.length() <=0)
		{
			System.out.println("Comuna no debe superar los 50 caracteres. Ingrese nuevamente:");
			comuna = reader.nextLine();
		}
		cliente.setComuna(comuna);
		
		//Ingreso y validación de edad.
		System.out.println("Ingresar Edad:");
		num = reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos");
			num =reader.nextLine();
		}
		
		int edad = Integer.parseInt(num);
		while (edad<0 || edad>=150)
		{
			System.out.println("Edad debe encontrarse entre 0 y 149. Ingrese nuevamente:");
			num = reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Debe ingresar solo números validos.");
				num =reader.nextLine();
			}
			edad = Integer.parseInt(num);
		}
		cliente.setEdad(edad);
		
		lista.add(cliente);
	}
}
