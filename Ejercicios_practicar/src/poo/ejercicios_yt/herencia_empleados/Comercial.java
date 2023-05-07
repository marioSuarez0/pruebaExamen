package poo.ejercicios_yt.herencia_empleados;

public class Comercial extends Empleado {
	
	private double comision;

	public Comercial(String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + "]";
	}
	
	public void plus() {
		if(getEdad() > 30 && comision > 200) {
			int salAumentado;
			salAumentado = getSalario() + getPlus();
			System.out.println("Plus aplicado a " + getNombre() + ". Salario final = " + salAumentado);
		}
	}


}
