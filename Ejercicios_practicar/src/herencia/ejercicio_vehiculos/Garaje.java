package herencia.ejercicio_vehiculos;

public class Garaje {
	
	private String nombre;
	private Coche[] plazasCoche;
	private Moto[] plazasMoto;
	private Bicicleta[] plazasBici;
	
	public Garaje(String nombre) {
		super();
		this.nombre = nombre;
		plazasCoche = new Coche[2];
		plazasMoto = new Moto[2];
		plazasBici = new Bicicleta[2];
	}

	public Garaje(String nombre, int numPlazasCoche, int numPlazasMoto, int numPlazasBici) {
		super();
		this.nombre = nombre;
		this.plazasCoche = new Coche [numPlazasCoche];
		this.plazasMoto = new Moto [numPlazasMoto];
		this.plazasBici = new Bicicleta [numPlazasBici];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void aparcar (Vehiculo[] vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo instanceof VehiculoMotorizado) {
			VehiculoMotorizado vm = (VehiculoMotorizado)vehiculo;
			System.out.println("Aparcando vehículo con matricula " + vm.getMatricula());
			}else {
				Bicicleta bici = (Bicicleta)vehiculo;
				System.out.println("Aparcando bici " + bici.getMarca());
				boolean hayPlazasLibres=false;
				
				for (int i = 0; i < plazasBici.length; i++) {
					if (plazasBici[i]==null) {
						plazasBici[i]=bici;
						System.out.println("Aparcada la bici "+bici.getMarca() + 
								"con "+bici.getNumMarchas() + " marchas ");
						hayPlazasLibres=true;
					}
				}
				if(!hayPlazasLibres) {
					System.out.println("No hay plazas libres para la bici" +bici.getMarca() 
							 + "con "+bici.getNumMarchas() + " marchas ");
				}
			}		
		}
	}
}
