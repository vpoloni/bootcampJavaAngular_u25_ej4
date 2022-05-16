package com.peliculasSalas.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salas")
public class Sala {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@OneToOne
	@JoinColumn(name = "pelicula")
	private Pelicula pelicula;

	// constructor vacío
	public Sala() {

	}

	// constructor con todos los parámetros
	public Sala(Long id, String nombre, Pelicula pelicula) {

		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;

	}

	// getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	// método toString
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}

}
