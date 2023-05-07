package poo.ejercicios_yt.ejercicio_productos;

public class Perecedero extends Producto{

	private int diasCaducar;

	public Perecedero(String nombre, int precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	@Override
	public String toString() {
		return "diasCaducar=" + diasCaducar;
	}

	@Override
	public double calcular(int cantProductos) {
		
		double precioFinal = super.calcular(cantProductos);
		
		switch(cantProductos) {
			case 1: precioFinal = precioFinal / 4;
			break;
			case 2: precioFinal = precioFinal / 3;
			break;
			case 3: precioFinal = precioFinal / 2;
			break;

		}
		return precioFinal;
	
	
	}
}
