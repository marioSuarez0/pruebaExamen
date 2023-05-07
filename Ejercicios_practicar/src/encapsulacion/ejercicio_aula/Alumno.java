package encapsulacion.ejercicio_aula;

public class Alumno {

	private String nombre;
	private String apellido;
	private double notaMedia;
	private Asignatura asignaturaAlumno;
	
	public Alumno(String nombre, String apellido, double notaMedia, Asignatura asignaturaAlumno) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaMedia = notaMedia;
		this.asignaturaAlumno = asignaturaAlumno;
	}
	
	public Alumno(String nombre, String apellido, double notaMedia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaMedia = notaMedia;
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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Asignatura getAsignatura() {
		return asignaturaAlumno;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignaturaAlumno = asignatura;
	}
	
	public void estudiar() {
		System.out.println("El alumno " + this.nombre + " está estudiando con una nota media de " + this.notaMedia);
	}
}
