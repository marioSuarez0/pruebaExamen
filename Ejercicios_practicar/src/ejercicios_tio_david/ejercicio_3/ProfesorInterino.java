package ejercicios_tio_david.ejercicio_3;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {
	
	private Calendar fecha;

	public ProfesorInterino(String nombre, String apellidos, int edad, int id, Calendar fecha) {
		super(nombre, apellidos, edad, id);
		this.fecha = fecha;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	@Override
	public void mostraDatos() {
		super.mostraDatos();
		System.out.println("Datos profesor interino: " + getNombre() + " " + getApellidos() +
				". Edad: " + getEdad() + ". Fecha de inicio de docencia: " + getFecha());
	}
	
	

}
