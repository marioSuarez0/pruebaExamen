package ejercicios_clase_2veces.arrayAlumnos;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private Asignatura[] asignaturas;
	
	public Alumno(String nombre, String apellido, Asignatura[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.asignaturas = asignaturas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	

}
