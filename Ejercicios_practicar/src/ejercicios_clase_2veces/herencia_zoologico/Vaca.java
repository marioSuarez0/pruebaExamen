package ejercicios_clase_2veces.herencia_zoologico;

public class Vaca extends Animal {
	
	private int numCuernos;

	public Vaca(String nombre, String tipo, int numCuernos) {
		super(nombre, tipo);
		this.numCuernos = numCuernos;
	}

	public int getNumCuernos() {
		return numCuernos;
	}
	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	@Override
	public void desplazar() {
		// TODO Auto-generated method stub
		super.desplazar();
	}
	
}
