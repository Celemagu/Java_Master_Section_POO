package Section14_Poo_Clases_objetos;


public class EjemploAutomovilStatic {

	public static void main(String[] args) {
		
		Motor motorSubaru= new Motor (2.0,TipoMotor.BENCIMA);
		Automovil subaru = new Automovil("Subaru", "Impreza");
				
		subaru.setMotor(motorSubaru);
		subaru.setEstanque(new Estanque());
		subaru.setColor(Color.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		
		
		
		Automovil mazda = new Automovil ("Mazda","BT-58", Color.ROJO,  new Motor (3.0, TipoMotor.BENCIMA) );
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setEstanque(new Estanque (60));
		System.out.println("Mazda Fabricante: "+mazda.getFabricante());
		
		
		Automovil nissan = new Automovil ("Nissan", "Navara", Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		
		Automovil nissan2 = new Automovil ("Nissan", "Navara",Color.GRIS,new Motor(3.5, TipoMotor.BENCIMA), new Estanque(50));
		nissan2.setColor(Color.AMARILLO); // cambia el atributo solo para nissan 2 //nissan2.colorPatente= "verde"; // cambia en todos
		nissan2.setTipo(TipoAutomovil.PICKUP);
		Automovil.setColorPatente(Color.AZUL) ;
		
		
		Automovil auto = new Automovil(); 
		
		
		
		System.out.println(subaru.detalle());
		System.out.println(mazda.detalle());
		System.out.println(nissan.detalle());
		System.out.println(nissan2.detalle());
		
		
		System.out.println();
		System.out.println("Automovil Color patente " +Automovil.getColorPatente());
		//System.out.println("Kilometros por litros: " + Automovil.calcularConsumo(300 , 60));
		System.out.println("Velocidad maxima carretera " + Automovil.VELOCIDAD_MAX_CARRETERA);
		System.out.println("Velocidad maxima Ciudad " + Automovil.VELOCIDAD_MAX_CIUDAD);
		
		
		System.out.println();
		TipoAutomovil tipoSubaru = subaru.getTipo(); // TipoAutomovil = enum tiposubaru= nueva variable 
		System.out.println("Tipo Subaru: " + tipoSubaru.getNombre());
		System.out.println("Tipo Subaru: " + tipoSubaru.getDescripcion());
		
		System.out.println(mazda.calcularConsumo(300, 0.7f));
		
	
	}

}
