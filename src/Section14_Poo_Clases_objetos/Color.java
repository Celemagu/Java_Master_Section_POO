package Section14_Poo_Clases_objetos;

public enum Color {
	ROJO ("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	BLANCO("Blanco"),
	GRIS("Gris oscuro"),
	NARANJO("Naranjo");
	
	
	private final String color;
	
	Color (String color) {
		this.color=color;
		
	}
	
	public String getColor () {
		return color;
	}
	
	
	public String toString() {
		return this.color;
	}
	
}
