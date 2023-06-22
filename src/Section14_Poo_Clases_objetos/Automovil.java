package Section14_Poo_Clases_objetos;

/**
 * @author cesar.mateus
 *
 */
public class Automovil implements Comparable <Automovil>{ // se agrega implements  Comparable <Automovil>  para que se pueda agregar metodo y definir por donde se debe comparar
	
	
	private int id;
	private String fabricante;
	private String modelo;
	private Color color = Color.GRIS;
	private Motor motor;
	private static Estanque estanque;
	private Persona conductor;
	private Rueda [] ruedas;
	private int indiceRuedas;
	
	private TipoAutomovil tipo;

	private static Color colorPatente = Color.NARANJO;
	private static int capacidadEstanqueEstatico=30;
	private static int ultimoId;
	
	public static final Integer VELOCIDAD_MAX_CARRETERA = 80;
	public static final int VELOCIDAD_MAX_CIUDAD = 80;
	
	
	public static final String COLOR_ROJO ="Rojo";
	public static final String COLOR_AMARILLO ="Amarillo";
	public static final String COLOR_AZUL ="Azul";
	public static final String COLOR_BLANCO ="Blanco";
	public static final String COLOR_GRIS ="Gris Oscuro";
	

//	public void detalle() { // devuelve la impresion de las variables
//		System.out.println("Auto Fabricante: "+ this.fabricante);
//		System.out.println("Auto Modelo: "+this.modelo);
//		System.out.println("Auto color: "+this.color);
//		System.out.println("Auto Cilindrada: "+this.cilindrada);
//		
//	}

	public Automovil() { 
		this.id= ++ultimoId;
		this.ruedas = new Rueda [5];
	}
	
	

	public Automovil(String fabricante, String modelo) { // crear contructor
		this ();
		this.fabricante = fabricante; // this.fabricante, toma la variable de la clase. fabricante toma el valorrecibido al metodo
		this.modelo = modelo;

	}

	public Automovil(String fabricante, String modelo, Color color) {  
		this(fabricante, modelo); // consulta la info del metodo que tiene como parametros fabricante y modelo (en este caso el metodo anterior)
		this.color = color;
	}

	public Automovil(String fabricante, String modelo, Color color, Motor motor) {
		this(fabricante, modelo, color);
		this.motor = motor;
	}

	public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
		this(fabricante, modelo, color, motor);
		this.estanque = estanque;
	}
	
	

	public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor,
			Rueda[] ruedas) {
		
		this(fabricante, modelo, color, motor, estanque);
		this.conductor = conductor;
		this.ruedas = ruedas;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id= id ;
	}
	
	
	
	public String getFabricante() { // leer informacion del metodo.
		return this.fabricante;
	}

	public void setFabricante(String fabricante) { // modificar la informacion del metodo.
		this.fabricante = fabricante; // this.fabricante, toma la variable de la clase. fabricante toma el valor  recibido al metodo
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static Color getColorPatente() {
		return colorPatente;
	}
	
	public static void setColorPatente(Color colorPatente) {
		Automovil.colorPatente= colorPatente;
	}
	
	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}
	
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Estanque getEstanque() {
		if (estanque == null) {
			this.estanque = new Estanque();
		}
		return estanque;
	}

	public void setEstanque(Estanque estanque) {
		this.estanque = estanque;
	}

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}
	
	public Automovil addRueda(Rueda rueda) { // contador que aumenta el indice de las ruedas
		if (indiceRuedas<this.ruedas.length) { // controla que no se desfase el arreglo
		this.ruedas	[indiceRuedas++] = rueda;
		}
		return this; //returna el mismo tipo
	}
	
	

	public String detalle() {
		StringBuilder sb = new StringBuilder(); // concatenar cadenas
		sb.append("\nAuto Id: " + this.id);
		sb.append("\nAuto Fabricante: " + this.fabricante);
		sb.append("\nAuto Modelo: " + getModelo()); // se puede usar a traves de This.modelo o llamar la funcion getModelo
		if (this.getTipo()!= null) {
		sb.append("\nAuto Tipo: " + getTipo().getNombre());
		}
		sb.append("\nAuto color: " + this.color);
		if (this.motor!= null) {
		sb.append("\nAuto Cilindrada: " + this.motor.getCilindrada());
		}
		sb.append("\nColor Patente: " + Automovil.colorPatente);
		if (getConductor()!= null) {
		sb.append("\nConductor Subaru: " + this.getConductor());
		}
		if (getRuedas()!= null) {
			sb.append("\nRuedas del automovil: ");
		for (Rueda r: this.getRuedas()) {
			sb.append ("\n" +r.getFabricante()+ ", aro: " + r.getAro() +", ancho: " + r.getAncho());
		}
		}

		return sb.toString();
	}

	public String acelerar(int rpm) {
		return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
	}

	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando!";
	}

	public String acelerarFrenar(int rpm) { // concatenar dos metodos
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}

	public double calcularConsumo(int km, float porcentajeBencina) {
		return km / (this.getEstanque().getCapacidad() * porcentajeBencina);
	}

	public static double calcularConsumo(int km, int porcentajeBencina) {
		return km / (estanque.getCapacidad()* (porcentajeBencina / 100));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Automovil)) { // se define que si son tipos de obj diferentes nmo arroja error y retorne
											// false
			return false;
		}
		Automovil a = (Automovil) obj;
		return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante())
				&& this.modelo.equals(a.getModelo()));
	}

	@Override
	public String toString() { // imprimir el objeto como texto
		return this.id + " : " +fabricante + " " + modelo;
	}



	@Override
	public int compareTo(Automovil a) {
		return this.conductor.toString().compareTo(a.conductor.toString()); // indicar al arreglo que para ordenarse sea por fabricante
	}
	

}
