package poo.ejercicios_yt.herencia_empleados;

public class Repartidor extends Empleado{
	
	private String zona;

	public Repartidor(String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + "]";
	}
	
	public void plus() {
		if(getEdad() < 25 && zona.equalsIgnoreCase("zona3")) {
			int salAumentado;
			salAumentado = getSalario() + getPlus();
			System.out.println("Plus aplicado a " + getNombre() + ". Salario final = " + salAumentado);
		}
	}

}
