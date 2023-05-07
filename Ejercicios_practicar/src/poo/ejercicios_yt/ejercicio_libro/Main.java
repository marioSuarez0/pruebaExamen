package poo.ejercicios_yt.ejercicio_libro;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(1, "nombre1", "nombreLibro1", 75);
		Libro libro2 = new Libro(2, "nombre2", "nombreLibro2", 100);

		System.out.println(libro1);
		System.out.println(libro2);
		
		if(libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El " + libro1 + " y es el que más páginas tiene");
		}else {
			System.out.println(libro2 + " y es el que más páginas tiene");
		}
	}

}
