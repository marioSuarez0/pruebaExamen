package ejercicios_tio_david.ejercicio_2;

public class Main {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Pepe");
		Cuenta cuenta2 = new Cuenta("Juan", 300);
		
		cuenta1.ingresar(300);
		cuenta2.ingresar(400);
		
		cuenta1.retirar(500);
		cuenta2.retirar(100);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}

}
