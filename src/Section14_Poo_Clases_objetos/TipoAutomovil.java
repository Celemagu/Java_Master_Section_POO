package Section14_Poo_Clases_objetos;

public enum TipoAutomovil {
	
	SEDAN("Sedan", "Auto Mediano", 4),
	STATION_WAGON("Station Wagon", "Auto Grande", 5),
	HATCHBACK("HatchBack", "Auto Compacto", 5),
	PICKUP("Pickup", "Camioneta", 4),
	COUPE("Coupé", "Auto Pequeño", 2),
	CONVERTIBLE("Convertible", "Auto Deportivo", 2),
	FURGON("Furgón", "Auto utilitario", 3),
	SUV("SUV", "Todo terreno deportivo", 5);
	
	private final String nombre;
	private final int numeroPuertas;
	private final String descripcion;
	
	
	private TipoAutomovil(String nombre, String descripcion, int numeroPuertas) { //constructor
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.numeroPuertas = numeroPuertas;
		
	}


	public String getNombre() {
		return nombre;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public String getDescripcion() {
		return descripcion;
	}
	
		

}
