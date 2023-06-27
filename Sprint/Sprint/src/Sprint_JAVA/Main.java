package Sprint_JAVA;

import java.util.ArrayList;
import java.util.Scanner;
import Entities.Usuario;
import Entities.Administrativo;
import Entities.Cliente;
import Entities.Profesional;
import Entities.Capacitacion;
import Containers.Cliente_Container;
import Containers.Administrativo_Container;
import Containers.Profesional_Container;
import Containers.Container;
import Containers.Capacitacion_Container;

public class Main extends Container{

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Creación de ArrayList para almacenar usuarios y capacitaciones.
		ArrayList<Usuario> usersList = new ArrayList<Usuario>();
		ArrayList<Capacitacion> capList = new ArrayList<Capacitacion>();
		Container usuario = null;
		Container capacitacion = null;
		
		System.out.println("Bienvenido!");

		// Variable a para controlar el menú.
		int a = 0;

		while (a != 9) {
			System.out.println("....MENU....");
			System.out.println("1- Almacenar Cliente.");
			System.out.println("2- Almacenar Profesional.");
			System.out.println("3- Almacenar Administrativo.");
			System.out.println("4- Almacenar Capacitación.");
			System.out.println("5- Eliminar Usuario.");
			System.out.println("6- Listar usuarios.");
			System.out.println("7- Listar usuarios por tipo.");
			System.out.println("8- Listar capacitación.");
			System.out.println("9-Salir.");
			System.out.println("Ingrese su opción: ");
			
			//validamos primero el no ingreso de letras.
			String num = reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Opción Invalida.");
				num =reader.nextLine();
			}			
			a = Integer.parseInt(num);

			switch (a) {
			// Opciones 1 a 4 llaman a métodos Add según clase.
			case 1: {
				usuario = new Cliente_Container(usersList);
				break;
			}
			case 2: {
				usuario = new Profesional_Container(usersList);
				break;
			}
			case 3: {
				usuario = new Administrativo_Container(usersList);
				break;
			}
			case 4: {
				capacitacion = new Capacitacion_Container(capList);
				break;
			}
			// Opción 5 elimina un usuario.
			case 5: {

				int c = 0;
				if (usersList.isEmpty()) {
					System.out.println("Listado de usuarios vacío.");
					c = 2;
				} else {
					System.out.println("Indique RUN de usuario a eliminar:");
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
					int run = Integer.parseInt(num);

					for (int i = 0; i < usersList.size(); i++) {
						Usuario usuarioAux = (Usuario) usersList.get(i);

						if (run == usuarioAux.getRun()) {
							usersList.remove(i);
							System.out.println("Se ha eliminado usuario RUN: " + run);
							c = 1;
						}
					}
				}
				if (c == 0) {
					System.out.println("Usuario no registrado.");
				}
				break;
			}
			// Opción 6 muestra datos de usuario.
			case 6: {

				if (usersList.isEmpty()) {
					System.out.println("Listado de usuarios vacío.");
				} else {
					for (int i = 0; i < usersList.size(); i++) {
						Usuario usuarioAux = (Usuario) usersList.get(i);
						System.out.println("RUN: " + usuarioAux.getRun() + " Nombre: " + usuarioAux.getNombre()
						+" Fecha de nacimiento: "+ usuarioAux.getFecha_nac());
					}
				}
				break;
			}
			// Opción 6 muestra datos de usuario según el tipo.
			case 7: {

				int p = 0;
				if (usersList.isEmpty()) {
					System.out.println("Listado de usuarios vacío.");
				} else {
					int b;
					System.out.println("Seleccione tipo de usuarios a mostrar:");
					System.out.println("1- Cliente.");
					System.out.println("2- Profesional.");
					System.out.println("3- Administrativo.");
					b = reader.nextInt();
					reader.nextLine();

					if (b == 1) {
						for (int i = 0; i < usersList.size(); i++) {
							if (usersList.get(i) instanceof Cliente) {
								p=1;
								Cliente clienteAux = (Cliente) usersList.get(i);
								Cliente_Container cliente_container = new Cliente_Container(clienteAux);
								System.out.println(cliente_container.analizarUsuario());
							}
						}
					}

					if (b == 2) {
						for (int i = 0; i < usersList.size(); i++) {
							if (usersList.get(i) instanceof Profesional) {
								p=1;
								Profesional profAux = (Profesional) usersList.get(i);
								Profesional_Container prof_container = new Profesional_Container(profAux);
								System.out.println(prof_container.analizarUsuario());
							}
						}
					}

					if (b == 3) {
						for (int i = 0; i < usersList.size(); i++) {
							if (usersList.get(i) instanceof Administrativo) {
								p=1;
								Administrativo adminAux = (Administrativo) usersList.get(i);
								Administrativo_Container admin_container = new Administrativo_Container(adminAux);
								System.out.println(admin_container.analizarUsuario());

							}
						}
					}
				}
				if(p==0)
				{
					System.out.println("No existen registros de dicho tipo.");
				}
				break;
			}
			// Muestra lista de capacitaciones.
			case 8: {

				if (capList.isEmpty()) {
					System.out.println("Lista de capacitaciones se encuentra vacía.");
				} else {
					for (int i = 0; i < capList.size(); i++) {
						Capacitacion capAux = (Capacitacion) capList.get(i);
						Capacitacion_Container cap_container = new Capacitacion_Container(capAux);
						System.out.println(cap_container.analizarCapacitacion());
					}
				}
				break;
			}
			// Opción invalida.
			case 9: {
				a =9;
				System.out.println("Salio del programa");
				break;
			}
			default:
				System.out.println("Opción invalida.");
			}

		}

	}
}
