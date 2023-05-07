package encapsulacion.ejercicio_coche;

public class Concesionario {

	public static void main(String[] args) {
		
		Piston piston1 = new Piston("1", "Marca1");
		Motor motor1= new Motor("MarcaMotor1", 120, piston1);
		Volante volante1 = new Volante("1", "Deportivo", "negro");
		
		double velocidad = 0;
		Coche coche1 = new Coche("1111-ABC","SEAT",volante1,motor1,velocidad);
		
		System.out.println(coche1.getMatricula());
		System.out.println(coche1.getVolante().getColor());

		velocidad = Math.random()*120;
		coche1.setVelocidad(velocidad);
		
		coche1.conducir();
	}

}
