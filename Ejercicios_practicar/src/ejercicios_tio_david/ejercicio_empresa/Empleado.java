package ejercicios_tio_david.ejercicio_empresa;

public class Empleado extends Persona {
	
	private double sueldo;
	private String categoría;
	private Departamento departamento;
	private Direccion direccion;
	
	public Empleado(String dni, String nombre, String apellidos, String estado, double sueldo, String categoría,
			Departamento departamento, Direccion direccion) {
		super(dni, nombre, apellidos, estado);
		this.sueldo = sueldo;
		this.categoría = categoría;
		this.departamento = departamento;
		this.direccion = direccion;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getCategoría() {
		return categoría;
	}
	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", categoría=" + categoría + ", departamento=" + departamento
				+ ", direccion=" + direccion + "]";
	}

	public void salarioNeto(int sueldo) {
		double salarioNeto;
		salarioNeto = (getSueldo() * 0.8); 
		System.out.println("El salario neto es " + salarioNeto);
	}
	
}
