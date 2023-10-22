package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private String nombreDeEmpleado;
	private String direccionDeEmpleado;
	private LocalDate fechaDeEmision;
	private float sueldoBrutoEmpleado;
	private float sueldoNetoEmpleado;
	
	public ReciboDeHaberes(String nombre, String direccion, float sueldoBruto, float sueldoNeto) {
		nombreDeEmpleado = nombre;
		direccionDeEmpleado = direccion;
		fechaDeEmision = LocalDate.now();
		sueldoBrutoEmpleado = sueldoBruto;
		sueldoNetoEmpleado = sueldoNeto;
	}
	
	public String nombreDeEmpleado() {
		return nombreDeEmpleado;
	}
	
	public String direccionDeEmpleado() {
		return direccionDeEmpleado;
	}
	
	public LocalDate fechaDeEmision() {
		return fechaDeEmision;
	}
	
	public float sueldoBrutoEmpleado() {
		return sueldoBrutoEmpleado;
	}
	
	public float sueldoNetoEmpleado() {
		return sueldoNetoEmpleado;
	}
}
