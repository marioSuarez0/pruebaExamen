package ejercicios_clase_2veces.ejercicio_interfaces;

public class Persona implements Insertable {
	
	private String nombre;
	private String dni;
	
	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void insert() {
		System.out.println("Insertando persona");
	}

}
