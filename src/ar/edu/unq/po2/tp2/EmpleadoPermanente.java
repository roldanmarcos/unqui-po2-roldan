package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			float sueldoBasico, int hijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadDeHijos = hijos;
		this.antiguedad = antiguedad;
	}
	
	public int cantidadDeHijos() {
		return cantidadDeHijos;
	}
	
	public int antiguedad() {
		return antiguedad;
	}
	
	public float sueldoBruto() {
		float sueldoBruto = this.sueldoBasico() + this.salarioFamiliar() ; 
		return sueldoBruto;
	}

	public float salarioFamiliar() {
		float salarioFamiliar = this.asignacionPorHijo() + this.asignacionPorConyuge() + this.pagoPorAntiguedad();
		return salarioFamiliar;
	}
	
	public int asignacionPorHijo() {
		int asignacionPorHijo = 150 * this.cantidadDeHijos();
		return asignacionPorHijo;
	}

	public int asignacionPorConyuge() {
		return (this.estadoCivil() == "casado") ? 100 : 0;
	}

	public int pagoPorAntiguedad() {
		int pagoPorAntiguedad = 50 * this.antiguedad();
		return pagoPorAntiguedad;
	}

	public float retencionesPorObraSocial() {
		float retencionesPorObraSocial = (float) ((0.10 * this.sueldoBruto()) + (20 * this.cantidadDeHijos()));
		return retencionesPorObraSocial;
	}

	public float retencionesPorAportes() {
		float retencionesPorAportes = (float) (0.15 * this.sueldoBruto());
		return retencionesPorAportes;
	}
	
	public float retencionesPorGastosAdministrativos() {
		return 0;
	}
}
