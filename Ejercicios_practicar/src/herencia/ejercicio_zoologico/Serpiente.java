package herencia.ejercicio_zoologico;

public class Serpiente extends Animal{
	
	private int longitud;

	public Serpiente(String nombre, String tipo, int longitud) {
		super(nombre, tipo);
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public void desplazarse() {
		System.out.println("La serpiente "+ getNombre() + " se desplaza reptando");
	}
}
