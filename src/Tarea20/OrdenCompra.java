package Tarea20;

import java.text.SimpleDateFormat;
import java.util.Date;




public class OrdenCompra {
	
	private int identificador;
	private String descripcion;
	private Date fecha =new Date();
	private Cliente cliente;
	private int indiceProductos;
	private static int ultimoId;
	
	Producto [] productos;
	//SimpleDateFormat formato = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss a");
	//String fechaconFormato=formato.format(fecha);
	
	public OrdenCompra() { 
		this.identificador= ++ultimoId;
		this.productos = new Producto[4];
	}
	
	
	
	
	public OrdenCompra addProducto(Producto prod) { 
		if (indiceProductos<this.productos.length) {
			this.productos[indiceProductos++] = prod;
		}
		return this; 
	}
	
	
	
	
	
	public OrdenCompra(String descripcion) {
		this();
		this.descripcion = descripcion;
	}

	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador= identificador ;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto[] getProductos() {
		return productos;
	}	
	
	
	public String detalle() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("\nIdentificador: " + this.identificador++);
		sb.append("\nCliente: " + this.getCliente());
		
		sb.append("\nfecha: " + fecha);
		
			int cont= 1;
			for (Producto p: this.getProductos()) {
				sb.append ( "\n"+cont+": " +p.getFabricante()+ ", " + p.getNombre()+", $ " + p.getPrecio());
				cont++;
			}
			int suma =0;
			for (Producto p: this.getProductos()) {
				
					suma+= p.getPrecio();
				
			}
			sb.append ( "\nGran total: " +suma);
			
			
		
		return sb.toString();
	}

}
