package org.ejemplo.modelo;

public class Empleado {
	
	private int id;
	private String nombre;
	private String salario;
	
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Empleado(int id, String nombre, String salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	

}
