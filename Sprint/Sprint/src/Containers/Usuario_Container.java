package Containers;
import java.util.List;
import java.util.Scanner;
import Entities.Usuario;
import Interface.Asesoria;

public class Usuario_Container implements Asesoria{

Usuario usuario = new Usuario();
static Scanner reader = new Scanner(System.in);

	//Constructor sin parámetros.
	public Usuario_Container() {}

	//Constructor con parámetros.
	public Usuario_Container(Usuario usuario) {
	this.usuario = usuario;
}

	//Método analizar usuario, utilizando el método ToString para desplegar datos de Usuario.
	@Override
	public String analizarUsuario() {
		
		return usuario.toString();
	}

	//Método para agregar un usuario con datos básicos.
	public void addUsuario(List<Usuario> lista) {
		
		System.out.println("Ingresar nombre de usuario:");
		usuario.setNombre(reader.nextLine());
		System.out.println("Ingresar RUT de usuario:");
		usuario.setRun(reader.nextInt());
		lista.add(usuario);
	}	
	
	//Método que muestra la edad.
	public void MostrarEdad(int edad) {
		System.out.println("El usuario tiene "+edad+" años.");
		
	}
}
