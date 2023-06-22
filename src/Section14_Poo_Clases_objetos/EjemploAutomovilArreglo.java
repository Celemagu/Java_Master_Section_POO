 package Section14_Poo_Clases_objetos;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

	public static void main(String[] args) {
		
		Persona conductorSubaru = new Persona ("Cesar", "Mateus");
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setMotor(new Motor(2.0,TipoMotor .BENCIMA));	
		subaru.setEstanque(new Estanque());
		subaru.setColor(Color.BLANCO);
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		subaru.setConductor(conductorSubaru);
		
		
 		Persona pato = new Persona ("Pato","Rodriguez");
		Automovil mazda = new Automovil ("Mazda","BT-58", Color.ROJO,  new Motor (3.0, TipoMotor.BENCIMA) );
		mazda.setTipo(TipoAutomovil.PICKUP);
		mazda.setEstanque(new Estanque ());
		mazda.setConductor(pato);
		
				
		Persona bea = new Persona ("Bea", "Jimenez");
		Automovil nissan = new Automovil ("Nissan", "Navara", Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
		nissan.setConductor(bea);
		nissan.setTipo(TipoAutomovil.PICKUP);
		
		
		Rueda [] ruedasNiss2 =  {new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5),
				new Rueda("Pirelli", 20, 11.5),new Rueda("Pirelli", 20, 11.5)};
		Persona lalo = new Persona ("Lalo", "Garza");
		Automovil suzuki = new Automovil ("Susuki", "Vitara",Color.GRIS,new Motor(1.6, TipoMotor.BENCIMA), new Estanque(50));
		suzuki.setConductor(lalo);
		suzuki.setColor(Color.AMARILLO); 
		suzuki.setTipo(TipoAutomovil.SUV);
		Automovil.setColorPatente(Color.AZUL) ;
		
		
		Automovil audi = new Automovil("Audi", "A3"); 
		audi.setConductor(new Persona ("isabella", "Mateus"));
		
		Automovil [] autos = new Automovil [5];
		autos[0]= subaru;
		autos[1]= mazda;
		autos[2]= nissan;
		autos[3]= suzuki;
		autos[4]= audi;
		
		
		Arrays.sort(autos);// se debe crear un metodo en automovil para que pueda comparar por algun campo de auto
		for (int i=0; i < autos.length; i++) {
			System.out.println(autos[i]);
		}
		
		
		
	}

}
