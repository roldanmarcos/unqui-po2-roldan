package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean esDePreciosCuidados;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		esDePreciosCuidados = false;
	}
	
	public Producto(String nombre, double precio, boolean booleano) {
		this.nombre = nombre;
		this.precio = precio;
		esDePreciosCuidados = booleano;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esDePreciosCuidados;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void aumentarPrecio(double cantidadAAumentar) {
		double precioAumentado = this.getPrecio() + cantidadAAumentar;
		this.setPrecio(precioAumentado);
	}
}
