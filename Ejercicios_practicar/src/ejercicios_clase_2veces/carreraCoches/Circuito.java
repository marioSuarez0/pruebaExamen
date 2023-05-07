package ejercicios_clase_2veces.carreraCoches;

public class Circuito {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto("nombrePiloto1", 10, "equipo1", 15);
		Piloto piloto2 = new Piloto("nombrePiloto2", 5, "equipo1", 10);
		Piloto piloto3 = new Piloto("nombrePiloto3", 1, "equipo1", 5);
		
		Coche coche1 = new Coche("escuderia1", "motor1", 1, piloto1, 100);
		Coche coche2 = new Coche("escuderia2", "motor2", 2, piloto2, 130);
		Coche coche3 = new Coche("escuderia3", "motor3", 3, piloto3, 300);
		
		Coche[] coches = {coche1, coche2, coche3};
		
		Carrera carrera1 = new Carrera("nombreCarrera", "circuito1", coches, 550);
		
		carrera1.iniciarCarrera();

	}

}
