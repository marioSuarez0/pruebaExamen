package herencia.ejercicio_zoologico;

public class Animal {
	
	private String nombre;
	private String tipo;
	
	public Animal(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void comer() {
		System.out.println("El animal " + this.nombre + " está comiendo");
	}

	public void desplazarse() {
		System.out.println("El animal " + this.nombre + " se desplaza a 4 patas");
	}
}
