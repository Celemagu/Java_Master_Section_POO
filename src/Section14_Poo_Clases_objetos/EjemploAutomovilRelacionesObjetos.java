 package Section14_Poo_Clases_objetos;


public class EjemploAutomovilRelacionesObjetos {

	public static void main(String[] args) {
		
//		Rueda [] ruedasSub = new Rueda [5];
//		ruedasSub [0] = new Rueda ("Yokohama", 16, 7.5); //  se reemplaza por el for de arriba
//		ruedasSub [1] = new Rueda ("Yokohama", 16, 7.5);
//		ruedasSub [2] = new Rueda ("Yokohama", 16, 7.5);
//		ruedasSub [3] = new Rueda ("Yokohama", 16, 7.5);
//		ruedasSub [4] = new Rueda ("Yokohama", 16, 7.5);
		
		Persona conductorSubaru = new Persona ("Cesar", "Mateus");
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setMotor(new Motor(2.0,TipoMotor .BENCIMA));	
		subaru.setEstanque(new Estanque());
		subaru.setColor(Color.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		//subaru.setRuedas(ruedasSub);
		Rueda [] ruedasSub = new Rueda [5];
		for (int i =0; i<ruedasSub.length; i++) {
			subaru.addRueda( new Rueda ("Yokohama", 16, 7.5) );
			
		}
		
 		Persona pato = new Persona ("Pato","Rodriguez");
		Automovil mazda = new Automovil ("Mazda","BT-58", Color.ROJO,  new Motor (3.0, TipoMotor.BENCIMA) );
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setEstanque(new Estanque ());
		mazda.setConductor(pato);
		//mazda.setRuedas(ruedaMaz);
		Rueda [] ruedaMaz = new Rueda [5];
		for (int i=0; i<ruedaMaz.length; i++) {
			mazda.addRueda( new Rueda ("Michelin", 18, 10.5));
		}
		
		
		
		Persona bea = new Persona ("Bea", "Jimenez");
		Automovil nissan = new Automovil ("Nissan", "Navara", Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
		nissan.setConductor(bea);
		nissan.setTipo(TipoAutomovil.PICKUP);
		nissan.addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5))
			.addRueda(new Rueda("Pirelli", 20, 11.5)).addRueda(new Rueda("Pirelli", 20, 11.5)); // se invoca el add rueda de manera encadenada
		
		Rueda [] ruedasNiss2 =  {new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5),
				new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5)};
		Persona lalo = new Persona ("Lalo", "Garza");
		Automovil nissan2 = new Automovil ("Nissan", "Navara",Color.GRIS,new Motor(3.5, TipoMotor.BENCIMA), new Estanque(50), lalo, ruedasNiss2);
		nissan2.setColor(Color.AMARILLO); // cambia el atributo solo para nissan 2 //nissan2.colorPatente= "verde"; // cambia en todos
		nissan2.setTipo(TipoAutomovil.PICKUP);
		Automovil.setColorPatente(Color.AZUL) ;
		
		
		Automovil auto = new Automovil(); 
		
		
		
		System.out.println(subaru.detalle());
		System.out.println(mazda.detalle());
		System.out.println(nissan.detalle());
		System.out.println(nissan2.detalle());
		
		
//		System.out.println("Conductor Subaru: " + subaru.getConductor()); // se reemplaza y se agrega en la clase automovil
//		System.out.println("Ruedas Subaru: ");
//		for (Rueda r: subaru.getRuedas()) {
//			System.out.println(r.getFabricante()+ ", aro: " + r.getAro() +", ancho: " + r.getAncho());
//		}
		
		
		
	
	}

}
