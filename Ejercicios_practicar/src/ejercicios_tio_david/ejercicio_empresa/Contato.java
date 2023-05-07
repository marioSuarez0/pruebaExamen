package ejercicios_tio_david.ejercicio_empresa;

public class Contato {

	private String fecha;
	private Empleado empleado;
	private Empresa empresa;
	
	public Contato(String fecha, Empleado empleado, Empresa empresa) {
		super();
		this.fecha = fecha;
		this.empleado = empleado;
		this.empresa = empresa;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Contato [fecha=" + fecha + ", empleado=" + empleado + ", empresa=" + empresa + "]";
	}
	
	
}
