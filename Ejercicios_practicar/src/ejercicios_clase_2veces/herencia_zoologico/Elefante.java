package ejercicios_clase_2veces.herencia_zoologico;

public class Elefante extends Animal {

	private int longTrompa;
	
	public Elefante(String nombre, String tipo, int longTrompa) {
		super(nombre, tipo);
		this.longTrompa = longTrompa;
	}
	public int getLongTrompa() {
		return longTrompa;
	}
	public void setLongTrompa(int longTrompa) {
		this.longTrompa = longTrompa;
	}
	@Override
	public void desplazar() {
		super.desplazar();
		System.out.println("despacio");
	}
	
	public void programarJava() {
		System.out.println(" El elefante " + getNombre() + " está programando en Java");
	}
	
}
