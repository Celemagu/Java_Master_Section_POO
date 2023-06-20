package Section14_Poo_Clases_objetos;

public class Automovil {

	private String fabricante;
	private String modelo;
	private String color = "Gris";
	private double cilindrada;
	private int capacidadEstanque= 40;
	
//	public void detalle() { // devuelve la impresion de las variables
//		System.out.println("Auto Fabricante: "+ this.fabricante);
//		System.out.println("Auto Modelo: "+this.modelo);
//		System.out.println("Auto color: "+this.color);
//		System.out.println("Auto Cilindrada: "+this.cilindrada);
//		
//	}
	
	public Automovil () { //constructor vacio
		
	}
	
	public Automovil (String fabricante, String modelo ) { //crear contructor
		this.fabricante = fabricante;  //this.fabricante, toma la variable de la clase. fabricante toma el valor recibido al metodo
		this.modelo=modelo;
				
	}
	
	
	public Automovil (String fabricante, String modelo, String color) {
		//this.fabricante=fabricante;
		//this.modelo= modelo;
		this (fabricante, modelo); // consulta la info del metodo que tiene como parametros fabricante y modelo (en este caso el metodo anterior)
		this.color=color;
	}
	
	
	public Automovil (String fabricante, String modelo, String color, double cilindrada) {
		this.fabricante=fabricante;
		this.modelo= modelo;
		this.color=color;
		this.cilindrada= cilindrada;
	}
	
	public Automovil (String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
		this.fabricante=fabricante;
		this.modelo= modelo;
		this.color=color;
		this.cilindrada= cilindrada;
		this.capacidadEstanque= capacidadEstanque;
	}
	
	
	
	
	
	public String getFabricante () {  // leer informacion del metodo.
		return this.fabricante;
	}
	
	public void setFabricante (String fabricante) { //modificar la informacion del metodo. 
		this.fabricante=fabricante; // this.fabricante, toma la variable de la clase. fabricante toma el valor recibido al metodo
	}
	
	
	public String getModelo () {
		return this.modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo=modelo;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public void setColor (String color) {
		this.color=color;
	}
	public double getCilindrada() {
		return this.cilindrada;
	}
	
	public void setCilindrada (double cilindrada) {
		this.cilindrada=cilindrada;
	}
	
	public int getcapacidadEstanque () {
		return capacidadEstanque;
	}
	
	public void setcapacidadEstanquea (int capacidadEstanque) {
		this.capacidadEstanque=capacidadEstanque;
	}
	
	public String detalle() {
		StringBuilder sb = new StringBuilder(); // concatenar cadenas
		sb.append("\nAuto Fabricante: "+ this.fabricante);
		sb.append("\nAuto Modelo: "+ getModelo()); // se puede usar a trves de This.modelo o llamar la funcion getModelo
		sb.append("\nAuto color: "+this.color);
		sb.append("\nAuto Cilindrada: "+this.cilindrada);
		
		return sb.toString();
	}
	
	public String acelerar (int rpm ) {
		return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
	}
	
	public String frenar ( ) {
		return this.fabricante + " " + this.modelo + " frenando!";
	}
	
	public String acelerarFrenar ( int rpm) { //concatenar dos metodos
		String acelerar = this.acelerar(rpm);
		String frenar= this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	
	public double calcularConsumo (int km, float porcentajeBencina ) {
		return km/(capacidadEstanque*porcentajeBencina);	
	}
	
	public double calcularConsumo (int km, int porcentajeBencina ) {
		return km/(capacidadEstanque*(porcentajeBencina/100f));	
	}
	
	
}
