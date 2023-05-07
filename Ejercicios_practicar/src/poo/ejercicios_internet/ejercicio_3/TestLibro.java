package poo.ejercicios_internet.ejercicio_3;

import java.util.Scanner;

public class TestLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("titulo1", "autor1", 100, 50);
		Libro libro2 = new Libro();
		
		Scanner scan = new Scanner(System.in);
        String titulo, autor;
        int numLibros;
        
        System.out.print("Introduce titulo: ");
        titulo = scan.nextLine();
        System.out.print("Introduce autor: ");
        autor = scan.nextLine();
        System.out.print("Numero de ejemplares: ");
        numLibros = scan.nextInt();
        
		libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setNumLibros(numLibros);
        
        System.out.println(libro1);
        System.out.println(libro2);
        
        if(libro1.prestamo()) {
        	System.out.println("Se han prestado el libro" + libro1.getTitulo());
        }else {
        	System.out.println("No se pueden prestar mas " + libro1.getTitulo());
        }	

		if(libro1.devolucion()) {
			System.out.println("Se han devuelto el libro" + libro1.getTitulo());
	    }else {
	        System.out.println("No se pueden devolver mas " + libro1.getTitulo());
	    }
		
		if(libro2.prestamo()) {
        	System.out.println("Se han prestado el libro" + libro2.getTitulo());
        }else {
        	System.out.println("No se pueden prestar mas " + libro2.getTitulo());
        }	

		if(libro2.devolucion()) {
			System.out.println("Se han devuelto el libro" + libro2.getTitulo());
	    }else {
	        System.out.println("No se pueden devolver mas " + libro2.getTitulo());
	    }
		
		System.out.println(libro1);
        System.out.println(libro2);
		
	}

}
