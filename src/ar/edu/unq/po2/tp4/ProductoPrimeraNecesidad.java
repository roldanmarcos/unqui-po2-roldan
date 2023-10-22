package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.setPrecio(this.precioConDescuento(precio, descuento));
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean booleano, double descuento) {
		super(nombre, precio, booleano);
		this.setPrecio(this.precioConDescuento(precio, descuento));
		
	}
	
	public double precioConDescuento (double precio, double porcentajeDescuento) {
		double descuento = (precio * porcentajeDescuento) / 100.0;
        double precioFinal = precio - descuento;
        return precioFinal;
	}
}
