package ejercicios_tio_david.ejercicio_3;

public class Profesor extends Persona {
	
	private int id;

	public Profesor(String nombre, String apellidos, int edad, int id) {
		super(nombre, apellidos, edad);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public void mostraDatos() {
		System.out.println("Datos profesor: " + getNombre() + " " + getApellidos() + ". Edad: " + getEdad() + id);
	}

}
