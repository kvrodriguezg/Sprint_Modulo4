package Containers;
import java.util.List;
import java.util.Scanner;
import Entities.Capacitacion;

public class Capacitacion_Container extends Container {
	
	Capacitacion capacitacion = new Capacitacion();
	static Scanner reader = new Scanner(System.in);
	
	//Constructor sin parámetros.
	public Capacitacion_Container() {
		super();
	}

	//Constructor con parámetros.
	public Capacitacion_Container(Capacitacion capacitacion) {
		this.capacitacion = capacitacion;
	}

	//Método mostrarDetalle que retorna mensaje con el detalle de la capacitación.
	public String mostrarDetalle(String lugar,String hora,String dia, String duracion) {
		
		String mensaje = "La capacitación será en "+ lugar + " a las "+ hora + " del día "+
		dia + ", y durará "+ duracion + " minutos.";
 		return mensaje;
	}
	
	//Método para desplegar el detalle de la capacitación con método ToString().
	public String analizarCapacitacion() {
		
		return capacitacion.toString();
	}
	
	
	//Método para añadir capacitación. 
	public Capacitacion_Container(List<Capacitacion> lista) {
		
		System.out.println("Ingrese ID de capacitación:");
		String num =reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		capacitacion.setId_cap(Integer.parseInt(num));
		
		System.out.println("Ingrese RUT:");
		num =reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		while(validarRut(Integer.parseInt(num)))
		{
			System.out.println("RUT no debe superar los 99.999.999. Ingrese nuevamente:");
			num =reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Debe ingresar solo números validos.");
				num =reader.nextLine();
			}
		}
		capacitacion.setRut(Integer.parseInt(num));
		
		System.out.println("Ingrese día entre lunes y domingo:");
		String dia = reader.nextLine();
		capacitacion.setDia(dia);
		
		System.out.println("Ingrese hora:");
		String hora = reader.nextLine();
		while(!validarHora(hora))
		{
			System.out.println("Formato de hora debe ser HH:MM. Ingrese nuevamente:");
			hora = reader.nextLine();
		}
		capacitacion.setHora(hora);
		
		System.out.println("Ingrese lugar:");
		String lugar=reader.nextLine();
		while( lugar.length()<10|| lugar.length()>50)
		{
			System.out.println("Lugar debe contener entre 10 y 50 caracteres. Ingrese nuevamente:");
			lugar = reader.nextLine();
		}
		capacitacion.setLugar(lugar);
		
		System.out.println("Ingrese duración:");
		String duracion=reader.nextLine();
		while( duracion.length()<=0 || duracion.length()>70)
		{
			System.out.println("Duración debe contener entre 1 y 70 caracteres. Ingrese nuevamente:");
			duracion = reader.nextLine();
		}
		capacitacion.setDuracion(duracion);
		
		System.out.println("Ingresar cantidad de asistentes:");
		num =reader.nextLine();
		while(!isNumeric(num)) {
			System.out.println("Debe ingresar solo números validos.");
			num =reader.nextLine();
		}
		while(Integer.parseInt(num)>1000) {
			System.out.println("Máximo de asistentes permitidos es 1000. Ingrese nuevamente:");
			num =reader.nextLine();
			while(!isNumeric(num)) {
				System.out.println("Debe ingresar solo números validos.");
				num =reader.nextLine();
			}
		}
		capacitacion.setCant_a(Integer.parseInt(num));

		lista.add(capacitacion);
	}

}
