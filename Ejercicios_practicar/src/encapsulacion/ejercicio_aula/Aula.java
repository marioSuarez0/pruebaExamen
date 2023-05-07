package encapsulacion.ejercicio_aula;

public class Aula {

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Mario", "Suárez", 8.7);
		alumno1.estudiar();
		
		Alumno alumno2 = new Alumno("Pepe", "Gomez", 9.0);
		alumno2.estudiar();
		
		Asignatura asignatura1 = new Asignatura("Programación", 7.2);
		Asignatura asignatura2 = new Asignatura("Mates", 9.3);
		
		Alumno alumno3 = new Alumno("Juan", "Perez", 6.5, asignatura1);
		
		alumno2.setAsignatura(asignatura2);
		
		System.out.println(alumno3.getAsignatura().getNota());
		System.out.println(alumno2.getAsignatura().getNombre());
	}

}
