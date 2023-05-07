package ejercicios_tio_david.ejercicio_herencia;

public class Empleado {
	
	private String nombre;
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;

	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public void Clasificacion(){
		System.out.println("La clasificación del empleado según la edad es:");
		if(edad <= 21) {
			System.out.println("Principiante");
		}else if(edad >= 22 && edad <= 35) {
			System.out.println("Intermedio");
		}else if(edad > 35) {
			System.out.println("Senior");
		}
	}
	
	public void ImprimirEmpleado() {
		System.out.println("Datos empleado:");
		System.out.println(this.nombre);
		System.out.println(this.cedula);
		System.out.println(this.edad);
		if(casado) {
			System.out.println("Casado");
		}else {
			System.out.println("Soltero");
		}
		System.out.println(this.salario);
	}
	
	public void AumentarSalario(int porcentaje) {
		double salarioAumentado;
		salarioAumentado = salario + (salario * (porcentaje/100));
		System.out.println("Salario aumentado:" + salarioAumentado);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
