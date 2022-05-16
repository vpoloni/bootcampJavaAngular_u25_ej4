package com.peliculasSalas.service;

import java.util.List;

import com.peliculasSalas.dto.Pelicula;

//interface con los métodos CRUD
public interface IPeliculaService {

	// READ todas películas
	public List<Pelicula> listarPeliculas();

	// CREATE nueva película
	public Pelicula guardarPelicula(Pelicula pelicula);

	// READ película por id
	public Pelicula listarPeliculaXID(Long id);

	// UPDATE película
	public Pelicula actualizarPelicula(Pelicula pelicula);

	// DELETE película
	public void eliminarPelicula(Long id);

}
