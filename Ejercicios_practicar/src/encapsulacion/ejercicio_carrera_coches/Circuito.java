package encapsulacion.ejercicio_carrera_coches;

public class Circuito {
	
	private static String nombre;

	public static void main(String[] args) {
		
		Circuito circuito = new Circuito(nombre);
		circuito.abrirCircuito();
		
	}
		
	public Circuito(String nombre) {
		super();
		this.nombre = nombre;
	}

		
	public void abrirCircuito() {
		Piloto piloto1 = new Piloto("Nombre1",45,"Equipo1",3);
		Piloto piloto2 = new Piloto("Nombre2",65,"Equipo3",1);
		Piloto piloto3 = new Piloto("Nombre3",35,"Equipo2",0);
		
		Coche coche1 = new Coche ("Escuderia1", "Motor1", 1, piloto1, 200);
		Coche coche2 = new Coche ("Escuderia2", "Motor2", 2, piloto2, 200);
		Coche coche3 = new Coche ("Escuderia3", "Motor3", 3, piloto3, 200);
		
		Carrera carrera = new Carrera("Carrera1", this.getNombre(), 2000);
		
		Coche[] cochesCarrera = {coche1, coche2, coche3};
		carrera.setParrilaSalida(cochesCarrera);
		
		carrera.iniciarCarrera();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
