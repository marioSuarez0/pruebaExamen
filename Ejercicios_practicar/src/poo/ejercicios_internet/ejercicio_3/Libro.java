package poo.ejercicios_internet.ejercicio_3;

public class Libro {
	
	private String titulo;
	private String autor;
	private int numLibros;
	private int numLibrosPrestados;
	
	public Libro() {
	}

	public Libro(String titulo, String autor, int numLibros, int numLibrosPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numLibros = numLibros;
		this.numLibrosPrestados = numLibrosPrestados;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumLibros() {
		return numLibros;
	}
	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}
	public int getNumLibrosPrestados() {
		return numLibrosPrestados;
	}
	public void setNumLibrosPrestados(int numLibrosPrestados) {
		this.numLibrosPrestados = numLibrosPrestados;
	}
	
	public boolean prestamo() {
		boolean prestamo = true;
		if(numLibros > numLibrosPrestados) {
			numLibrosPrestados += 1;
			prestamo = true;
		}else {
			prestamo = false;
		}
		return prestamo;
	}
	
	public boolean devolucion() {
		boolean devolucion = true;
		if(numLibrosPrestados == 0) {
			devolucion = false;
		}else {
			numLibrosPrestados -= 1;
			devolucion = true;
		}
		return devolucion;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " de " + autor + " tiene " + numLibros + " ejemplares, y se han prestado "
				+ numLibrosPrestados + " de ellos";
	}
	
	
	

}
