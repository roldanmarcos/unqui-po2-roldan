package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private float sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, float sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public float getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public float sueldoNeto() {
		float sueldoNeto = this.sueldoBruto() - this.retenciones();
		return sueldoNeto;
	}
	
	public float retenciones() {
		float retenciones = this.retencionesPorObraSocial() + this.retencionesPorAportes() + this.retencionesPorGastosAdministrativos();
		return retenciones;
	}
	
	public int edad() {
		int edad = (Period.between(fechaDeNacimiento, LocalDate.now()).getYears());
		return edad;
	}
	
	public abstract float sueldoBruto();
	
	public abstract float retencionesPorObraSocial();
	
	public abstract float retencionesPorAportes();
	
	public abstract float retencionesPorGastosAdministrativos();
	
}
