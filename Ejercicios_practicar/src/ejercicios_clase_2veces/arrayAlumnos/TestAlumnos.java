package ejercicios_clase_2veces.arrayAlumnos;

public class TestAlumnos {

	public static void main(String[] args) {
		
		Asignatura asignatura1alumno1 = new Asignatura("asignatura1alumno1", 6.5);
		Asignatura asignatura2alumno1 = new Asignatura("asignatura2alumno1", 8.0);
		
		Asignatura[] asignaturasAlumno1 = {asignatura1alumno1, asignatura2alumno1};
		
		Alumno alumno1 = new Alumno("nombre1", "apellido1", asignaturasAlumno1);
		
		Asignatura asignatura1alumno2 = new Asignatura("asignatura1alumno2", 5.0);
		Asignatura asignatura2alumno2 = new Asignatura("asignatura2alumno2", 9.0);
		
		Asignatura[] asignaturasAlumno2 = {asignatura1alumno2, asignatura2alumno2};
			
		Alumno alumno2 = new Alumno("nombre2", "apellido2", asignaturasAlumno2);
		
		Alumno[] alumnos = {alumno1, alumno2};
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			for (Asignatura asignatura : asignaturasAlumno) {
				System.out.println(asignatura.getNombre() + " = " + asignatura.getNota());	
			}		
		}
		
		double totalAsignaturas = 0;
		double notaTotal = 0;
		for (Alumno alumno : alumnos) {
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			double numAsignaturasAlumno = asignaturasAlumno.length;
			totalAsignaturas += numAsignaturasAlumno; 
			for (Asignatura asignatura : asignaturasAlumno) {
				notaTotal += asignatura.getNota();
			}
		}
		System.out.println("La nota media total de todos los alumnos es " + notaTotal / totalAsignaturas);
		
		Alumno alumnoNotaMediaMasAlta = null;
		double notaMediaMasAlta = 0;
		double notaMedia = 0;
		for (Alumno alumno : alumnos) {
			double notaAlumno = 0;
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			totalAsignaturas = asignaturasAlumno.length;
			for (Asignatura asignatura : asignaturasAlumno) {
				notaAlumno += asignatura.getNota();
				notaMedia = notaAlumno / totalAsignaturas;
			}
			System.out.println("Nota media de " + alumno.getNombre() + " = " + notaMedia);
			
			if(notaMedia > notaMediaMasAlta) {
				notaMediaMasAlta = notaMedia;
				alumnoNotaMediaMasAlta = alumno;
			}
		}
		
		System.out.println("La nota media más alta es " + notaMediaMasAlta + " de " + alumnoNotaMediaMasAlta.getNombre());
		
		
	}

}


