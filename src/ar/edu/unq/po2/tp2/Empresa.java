package ar.edu.unq.po2.tp2;
import java.util.List;
import java.util.ArrayList;
public class Empresa {
	
	private String nombre;
	private String cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.recibos = new ArrayList<ReciboDeHaberes>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCuit() {
		return this.cuit;
	}
	
	public List<Empleado> getEmpleados() {
		return this.empleados;
		
	}
	
	public List<ReciboDeHaberes> getRecibos() {
		return this.recibos;
	}
	
	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}
	
	public void liquidarSueldos() {
		for (Empleado empleado : empleados) {
		    hacerReciboPara(empleado);
		}
	}
	
	public void hacerReciboPara(Empleado empleado) {
		ReciboDeHaberes recibo = new ReciboDeHaberes(empleado.getNombre(), empleado.getDireccion(), empleado.sueldoBruto(), empleado.sueldoNeto());
		recibos.add(recibo);
	}

	
	
}
