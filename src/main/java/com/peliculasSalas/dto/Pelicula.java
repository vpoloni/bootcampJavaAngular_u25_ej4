package com.peliculasSalas.dto;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "peliculas")
public class Pelicula {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacionedad")
	private int calificacionEdad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Sala> sala;

	// constructor vacío
	public Pelicula() {

	}

	// constructor con todos los parámetros
	public Pelicula(Long id, String nombre, int calificacionEdad) {

		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;

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

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	// método toString
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad + ", sala=" + sala
				+ "]";
	}

}
