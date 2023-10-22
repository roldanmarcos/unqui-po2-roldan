package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	private int nroDeContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			float sueldoBasico, int nroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.nroDeContrato = nroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	public int nroDeContrato() {
		return nroDeContrato;
	}
	
	public String medioDePago() {
		return medioDePago;
	}
	
	public float sueldoBruto() {
		return this.sueldoBasico();
	}
	
	public float retencionesPorObraSocial() {
		return 0;
	}

	public float retencionesPorAportes() {
		return 0;
	}
	
	public float retencionesPorGastosAdministrativos() {
		return 50;
	}
	
}
