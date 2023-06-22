package Section14_Poo_Clases_objetos;

import java.util.Date;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Motor motorSubaru= new Motor (2.0,TipoMotor.BENCIMA);
		Automovil subaru = new Automovil("Subaru", "Impreza");
		Date fecha = new Date ();		
		subaru.setMotor(motorSubaru);
		subaru.setEstanque(new Estanque());
		subaru.setColor(Color.BLANCO);
		
		Motor motorMazda= new Motor (3.0, TipoMotor.DIESEL);
		Automovil mazda = new Automovil ("Mazda","BT-58", Color.ROJO, motorMazda);
		mazda.setEstanque(new Estanque(45));
		System.out.println("Mazda Fabricante: "+mazda.getFabricante());
		
		
		Automovil nissan = new Automovil ("Nissan", "Navara",Color.GRIS,new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
		Automovil nissan2 = new Automovil ("Nissan", "Navara",Color.GRIS,new Motor (3.5, TipoMotor.BENCIMA), new Estanque (50));
		Automovil auto = new Automovil(); 
		
		
		System.out.println("Son iguales? " + (nissan == nissan2));
		System.out.println("Son iguales? " + (nissan.equals(nissan2)));
		
		System.out.println(subaru.detalle());
		System.out.println(mazda.detalle());
		System.out.println(nissan.detalle());
		
		System.out.println(auto.equals(nissan));
		System.out.println(auto.equals(fecha));
		
		
		System.out.println(nissan);
		System.out.println(nissan.toString());
		
		System.out.println();
		System.out.println(subaru.acelerar(3000));
		System.out.println(subaru.frenar());
		
		System.out.println();
		System.out.println(mazda.acelerarFrenar(5000));
		System.out.println();
		System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300, 0.60f));
		System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300, 60));
		System.out.println("Kilometros por litro "+ nissan.calcularConsumo(300, 60));
	}

}
