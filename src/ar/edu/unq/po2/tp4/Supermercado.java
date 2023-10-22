package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {

		private String nombre;
		private String direccion;
		private ArrayList<Producto> productos;
		
		public Supermercado(String nombre, String direccion) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.productos = new ArrayList<Producto>();
		}
		
		public String getNombre() {
			return this.nombre;
		}
		
		public String getDireccion() {
			return this.direccion;
		}
		
		public int getCantidadDeProductos() {
			return productos.size();
		}
		
		public void agregarProducto(Producto productoAAgregar) {
			productos.add(productoAAgregar);
		}
		
		public double getPrecioTotal() {
			double totalDePrecios = 0;
			for(Producto producto : productos) {
				totalDePrecios = totalDePrecios + producto.getPrecio();
			}
			return totalDePrecios;
		}
		
		
}
