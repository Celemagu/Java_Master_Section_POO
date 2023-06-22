package Tarea20;




public class EjemploOrdenes {

	public static void main(String[] args) {
		
		Cliente cord1 = new Cliente ("Cesar", "Mateus");
		OrdenCompra ord1 = new OrdenCompra("orden de compra 1");
		ord1.setCliente(cord1);
		Producto [] productos = new Producto [3];
		for (int i=0; i<productos.length; i++) {
			ord1.addProducto( new Producto("LG", "TV 55", 1200000)).addProducto( new Producto("Xiaomi", "Celular Poco", 2000000))
				.addProducto( new Producto("Sony", "Blue Ray", 220000)).addProducto( new Producto("Asus", "Pc Vivobook 14", 3000000));
		}
		
		
		Cliente cord2 = new Cliente ("Pato", "Mazabuel");
		OrdenCompra ord2 = new OrdenCompra("orden de compra 2");
		ord2.setCliente(cord2);
		for (int i=0; i<productos.length; i++) {
			ord2.addProducto( new Producto("Samsung", "S22 Ultra", 5000000)).addProducto( new Producto("Scott", "Bicicleta Scale 980", 4000000))
				.addProducto( new Producto("Sony", "Pantalla 34", 500000)).addProducto( new Producto("Acer", "Nitro 5", 3349000));
		}
		

		Cliente cord3 = new Cliente ("Isabella", "Mateus");
		OrdenCompra ord3 = new OrdenCompra("orden de compra 2");
		ord3.setCliente(cord3);
		for (int i=0; i<productos.length; i++) {
			ord3.addProducto( new Producto("Xiaomi", "Mi Robot Vacuum-Mop 2", 1500000)).addProducto( new Producto("Haceb", "Nevera 226 litros", 1609000))
				.addProducto( new Producto("Iphone", "14 pro", 6800000)).addProducto( new Producto("PS5", "Estándar 825GB ", 3499000));
		}
		
		System.out.println(ord1.detalle());
		System.out.println(ord2.detalle());
		System.out.println(ord3.detalle());
	
	}

}
