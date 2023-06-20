package Section14_Poo_Clases_objetos;

public class EjemploAutomovil {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("Subaru", "Impreza");
		
		subaru.setCilindrada(2.4);
		subaru.setColor("Blanco");
		
		Automovil mazda = new Automovil ("Mazda","BT-58", "Rojo", 3.0 );
		System.out.println("Mazda Fabricante: "+mazda.getFabricante());
		
		
		Automovil nissan = new Automovil ("Nissan", "Navara","Gris Oscuro",3.5, 50);
		
		System.out.println(subaru.detalle());
		System.out.println(mazda.detalle());
		System.out.println(nissan.detalle());
		
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
