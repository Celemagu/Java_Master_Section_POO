package com.cmateus.appfacturas;

import java.util.Scanner;

import com.cmateus.appfacturas.modelo.*;


public class EJemploFactura {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente ();
		cliente.setNit("102254789");
		cliente.setNombre("Cesar");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una descripcion de la factura: ");
		String desc= s.nextLine();
		Factura factura = new Factura (desc, cliente);
		
		Producto producto;
//		String nombre;
//		float precio;
//		int cantidad; 
		
		System.out.println();
		
		for (int i =0; i <5; i ++) {
			producto = new Producto();
			System.out.print("Ingrese producto Nº " + producto.getCodigo()+ ": " );
//			nombre = s.nextLine(); // next solo permite ingresar una sola palabra sin espacios
			producto.setNombre(s.nextLine());
			
			System.out.print("Ingrese el Precio: " );
//			precio = s.nextFloat(); // next solo permite ingresar una sola palabra sin espacios
			producto.setPrecio(s.nextFloat());
			
			System.out.print("Ingrese la cantidad " );
//			cantidad = s.nextInt(); // next solo permite ingresar una sola palabra sin espacios
			
			ItemFactura item = new ItemFactura(s.nextInt(), producto);
			factura.addItemFactura(item);
			
			System.out.println( );
			s.nextLine();
		}
		
		System.out.print(factura.generarDetalle() );

	}

}
