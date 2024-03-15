package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class productModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Id;  
	private String nombre;
    private double precio;
	
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double number) {
		this.precio = number;
	}
	public Integer getId() {
		return Id;
	}
  
	public void setId(Integer Id) {
		this.Id= Id;
	}
  
  
}
