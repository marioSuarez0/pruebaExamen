package ejercicios_clase_2veces.composicion_coche;

public class TestCoche {

	public static void main(String[] args) {
		
		Piston piston = new Piston(1, "marcaPiston");
		Motor motor = new Motor("marcaMotor", 20, piston);
		Volante volante = new Volante(1, "tipoVolante", "colorVolante");
		Coche coche = new Coche("matriculaCoche", "marcaCoche", volante, motor, 120.0);
		
		System.out.println("Id pistón = " + coche.getMotor().getPiston().getId());
		System.out.println("Color volante = " + coche.getVolante().getColor());
	}

}
