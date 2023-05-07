package encapsulacion.ejercicio_maniquis;

public class Tienda {
	
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Tienda tienda = new Tienda("tienda1");
		tienda.abrirTienda();
		
	}
	
	public void abrirTienda() {
	
		Maniqui [] maniquis = crearManiqui();
		precioManiquis(maniquis);
		
	}
	
	// Creo un metodo para calcular el precio de los maniquis
	private void precioManiquis(Maniqui[] maniquis) {
		
		for (Maniqui maniqui : maniquis) {
			double total = 0;
			
			if (maniqui.getCamisa() != null) {
				total += maniqui.getCamisa().getPrecio();
			}
			if (maniqui.getPantalon() != null) {
				total += maniqui.getPantalon().getPrecio();
			}
			if (maniqui.getVestido() != null) {
				total+= maniqui.getVestido().getPrecio();
			}
			
			System.out.println("El precio del maniqui " + maniqui.getId() + " es de " + total);
		}
	}
	
	private Maniqui[] crearManiqui() {
		
		Boton boton1 = new Boton("Blanco1","Redondo","Peqeño");
		Boton boton2 = new Boton("Blanco2","Redondo","Peqeño");
		Boton boton3 = new Boton("Blanco3","Redondo","Peqeño");
		Boton boton4 = new Boton("Blanco4","Redondo","Peqeño");
		Boton boton5 = new Boton("Blanco5","Redondo","Peqeño");
		
		Boton[] botones_camisa = {boton1,boton2,boton3,boton4};
		
		Camisa camisa = new Camisa ("L","Blanco", 40, botones_camisa);
		Pantalon pantalon = new Pantalon("L","Vaquero", 50, boton5);
		
		Vestido vestido = new Vestido("M","Verde",60);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2);
		
		maniqui1.vestir(camisa, pantalon);
		maniqui2.vestir(vestido);
		
		Maniqui[] maniquis = {maniqui1, maniqui2};
		return maniquis;
	}

}
