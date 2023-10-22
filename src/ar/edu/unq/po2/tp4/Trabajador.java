package ar.edu.unq.po2.tp4;

public class Trabajador {

	public double getTotalPercibido() {
		return  montoTotalPercibido;
	}
	
	public double getMontoImponible() {
		double montoImponible = this.getTotalPercibido();
		return montoImponible;
	}
	
	public double getImpuestoAPagar() {
		getMontoImponible() % 2;
		return montoAPagar;
	}
	
	public double getIngresoPorHorasExtras() {
		cantidadDeHorasExtrasRealizadas ;
		return ;
	}
}
