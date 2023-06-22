package Section14_Poo_Clases_objetos;


public class EjemploAutomovilEnum {

	public static void main(String[] args) {
		
		
		Motor motorSubaru= new Motor (2.0,TipoMotor.BENCIMA);
		Automovil subaru = new Automovil("Subaru", "Impreza");
				
		subaru.setMotor(motorSubaru);
		subaru.setEstanque(new Estanque());
		subaru.setColor(Color.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		
		
		Automovil mazda = new Automovil ("Mazda","BT-58", Color.ROJO,  new Motor(3.0, TipoMotor.BENCIMA) );
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setEstanque(new Estanque(45));
		System.out.println("Mazda Fabricante: "+mazda.getFabricante());
		
		
		System.out.println();
		TipoAutomovil tipo = subaru.getTipo(); // TipoAutomovil = enum tiposubaru= nueva variable 
		System.out.println("Tipo Subaru: " + tipo.getNombre());
		System.out.println("Tipo Subaru: " + tipo.getDescripcion());
		
		
		tipo = mazda.getTipo();
		
		
		switch (tipo) {
		case CONVERTIBLE->
			System.out.println("El automovil es deportivo y descapotable de dos puertas");
		case COUPE ->
			System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
		case FURGON->
			System.out.println("Es un automovil utilitario de transporte de empresas");
		case HATCHBACK->
			System.out.println("Es un automovil mediano compacto, aspecto deportivo");
		case PICKUP->
			System.out.println("Es un automovil de doble cabina o camioneta");
		case SEDAN->
			System.out.println("Es un automovil mediano");
		case STATION_WAGON->
			System.out.println("Es un automovil mas grande, con maletero grande");
		}
		
		
		TipoAutomovil tipos [] = TipoAutomovil.values();
		for (TipoAutomovil ta:tipos) {
			System.out.print(ta + " => " + ta.name() + ", " + ta.getNombre()+ ", " + ta.getNumeroPuertas());
			System.out.println();
		}
		
 		
	
	}

}
