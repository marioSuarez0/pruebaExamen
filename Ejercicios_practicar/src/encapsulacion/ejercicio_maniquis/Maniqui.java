package encapsulacion.ejercicio_maniquis;

public class Maniqui {
	
	private int id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	public Maniqui(int id) {
		super();
		this.id = id;
		System.out.println("Creando maniquí desnudo");
	}

	public Maniqui(int id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		System.out.println("Creando maniquí con id " + this.id + " con camisa y pantalón");
	}

	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
		System.out.println("Creando maniquí con id " + this.id + " con vestido de color " + vestido.getColor());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	public void vestir(Camisa camisa, Pantalon pantalon) {
		System.out.println("Vistiendo maniquí con id " + this.id + " con camisa y pantalón");
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
		
	}
	
	public void vestir(Vestido vestido) {
		System.out.println("Vistiendo maniquí con id " + this.id + " con vestido de color "+vestido.getColor());
		desvestir();
		this.vestido = vestido;
	
	}
	
	
	public void desvestir() {
		System.out.println("Desvistiendo maniquí con id " + this.id);
		if(camisa != null)
			camisa = null;
		
		if(pantalon != null)
			pantalon = null;
		
		if (vestido != null)
			vestido = null;
	}
}