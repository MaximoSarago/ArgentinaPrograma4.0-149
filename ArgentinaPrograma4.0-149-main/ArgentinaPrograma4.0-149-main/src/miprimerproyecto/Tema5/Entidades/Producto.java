package miprimerproyecto.Tema5.Entidades;

import java.time.LocalDate;

public class Producto {

	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precio;
	
	private static final Double minPrecio = 0.1;
	
	public Producto(String nombre) {
		this.nombre = nombre;
		this.setFechaAlta(LocalDate.now());
		this.setPrecio(minPrecio);
	}
	
	public Producto(String nombre, String descripcion, Double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Integer getPesoKg() {
		return pesoKg;
	}
	public void setPesoKg(Integer pesoKg) {
		this.pesoKg = pesoKg;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
