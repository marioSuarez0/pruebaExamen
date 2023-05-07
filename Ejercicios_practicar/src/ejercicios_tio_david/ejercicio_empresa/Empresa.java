package ejercicios_tio_david.ejercicio_empresa;

public class Empresa {
	
	private String nombre;
	private int cif;
	private Direccion direccion;
	private Departamento departamento;
	
	public Empresa(String nombre, int cif, Direccion direccion, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
		this.departamento = departamento;
	}

	public Empresa(String nombre, int cif, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCif() {
		return cif;
	}
	public void setCif(int cif) {
		this.cif = cif;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion + ", departamento="
				+ departamento + "]";
	}
	
	

}
