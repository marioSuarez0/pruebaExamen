package ejercicios_tio_david.ejercicio_empresa;

public class Departamento {
	
	private String nombre;
	private int id;
	private String localizacion;
	private Empresa empresa;
	private Empleado empleado;
	
	public Departamento(String nombre, int id, String localizacion, Empresa empresa, Empleado empleado) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.localizacion = localizacion;
		this.empresa = empresa;
		this.empleado = empleado;
	}
	
	public Departamento(String nombre, int id, String localizacion, Empresa empresa) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.localizacion = localizacion;
		this.empresa = empresa;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", id=" + id + ", localizacion=" + localizacion + ", empresa="
				+ empresa + ", empleado=" + empleado + "]";
	}

	
	
	

}
