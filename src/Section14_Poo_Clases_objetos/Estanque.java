package Section14_Poo_Clases_objetos;

public class Estanque {
	
	private int capacidad;
	
	public Estanque () {
		this.capacidad = 40;
	}

	public Estanque(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getCapacidad () {
		return capacidad;
	}

}
