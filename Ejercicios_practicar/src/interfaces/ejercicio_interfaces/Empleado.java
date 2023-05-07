package interfaces.ejercicio_interfaces;

public class Empleado extends Persona implements Empleable, Insertable {
	
	private int id;
	private int antiguedad;
	
	public Empleado(String nombre, String dni, int id, int antiguedad) {
		super(nombre, dni);
		this.id = id;
		this.antiguedad = antiguedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	@Override
	public void fichar() {
		System.out.println("Fichando empleado "+id);
	}
	
	@Override
	public void insert() {
		System.out.println("Insertando empleado "+id);
	}

}
