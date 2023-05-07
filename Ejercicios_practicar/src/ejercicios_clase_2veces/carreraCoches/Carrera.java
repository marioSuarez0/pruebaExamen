package ejercicios_clase_2veces.carreraCoches;

public class Carrera {
	
	private String nombre;
	private String circuito;
	private Coche[] parrillaDeSalida;
	private int distancia;
	
	public Carrera(String nombre, String circuito, Coche[] parrillaDeSalida, int distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrillaDeSalida = parrillaDeSalida;
		this.distancia = distancia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public Coche[] getParrillaDeSalida() {
		return parrillaDeSalida;
	}
	public void setParrillaDeSalida(Coche[] parrillaDeSalida) {
		this.parrillaDeSalida = parrillaDeSalida;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public void iniciarCarrera() {
		boolean hayGanador = false;
		
		while(!hayGanador) {
			for (Coche coche : parrillaDeSalida) {
				coche.correr();
				if(coche.getAvance() > this.distancia) {
					System.out.println("El coche " + coche.getNumero() + " ha ganado");
					hayGanador = true;
					break;
				}
			}
		}
		System.out.println("Carrera finalizada");
	}

}
