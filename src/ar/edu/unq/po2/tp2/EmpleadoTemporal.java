package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{
	private LocalDate fechaDeFin;
	private int cantidadDeHorasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			float sueldoBasico, LocalDate fechaDeFin) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaDeFin = fechaDeFin;
	}
	
	public LocalDate fechaDeFin() {
		return fechaDeFin;
	}
	
	public int cantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}
	
	public void cantidadDeHorasExtras(int horas) {
		this.cantidadDeHorasExtras = horas;
	}
	
	public float sueldoBruto() {
		float sueldoBruto = this.sueldoBasico() + this.pagoPorHorasExtras() ; 
		return sueldoBruto;
	}

	public int pagoPorHorasExtras() {
		int pagoPorHorasExtras = (40 * this.cantidadDeHorasExtras());
		return pagoPorHorasExtras;
	}
	
	public float retencionesPorObraSocial() {
		float retencionesPorObraSocial = (float) ((0.10 * this.sueldoBruto()) + (this.pagoSiEsMayorDe50()));
		return retencionesPorObraSocial;
	}
	
	public int pagoSiEsMayorDe50() {
		return (this.edad() > 50) ? 25 : 0 ;
	}

	public float retencionesPorAportes() {
		float retencionesPorAportes = (float) ((0.10 * this.sueldoBruto()) + (5 * this.cantidadDeHorasExtras()));
		return retencionesPorAportes;
	}
	
	public float retencionesPorGastosAdministrativos() {
		return 0;
	}
}
