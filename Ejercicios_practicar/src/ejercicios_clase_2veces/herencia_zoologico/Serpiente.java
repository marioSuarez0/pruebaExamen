package ejercicios_clase_2veces.herencia_zoologico;

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
	public void desplazar() {
		System.out.println("La serpiente  " + getNombre() + " se desplaza reptando");
	}
	
}
