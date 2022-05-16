package com.peliculasSalas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculasSalas.dto.Pelicula;
import com.peliculasSalas.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServideImpl;

	// listar todas las películas
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas() {
		return peliculaServideImpl.listarPeliculas();
	}

	// crear nueva película
	@PostMapping("/peliculas")
	public Pelicula crearEmpleado(@RequestBody Pelicula pelicula) {
		return peliculaServideImpl.guardarPelicula(pelicula);
	}

	// listar película por id
	@GetMapping("/peliculas/{id}")
	public Pelicula listarPeliculaXID(@PathVariable(name = "id") Long id) {

		Pelicula peliculaPorId = new Pelicula();
		peliculaPorId = peliculaServideImpl.listarPeliculaXID(id);
		return peliculaPorId;
	}

	// actualizar película
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") Long id, @RequestBody Pelicula pelicula) {

		Pelicula peliculaSeleccionada = new Pelicula();
		Pelicula peliculaActualizada = new Pelicula();

		// obtenemos película de la DB
		peliculaSeleccionada = peliculaServideImpl.listarPeliculaXID(id);

		// seteamos nuevos valores
		peliculaSeleccionada.setNombre(pelicula.getNombre());
		peliculaSeleccionada.setCalificacionEdad(pelicula.getCalificacionEdad());

		// actualizamos película en la DB
		peliculaActualizada = peliculaServideImpl.actualizarPelicula(peliculaSeleccionada);

		return peliculaActualizada;
	}

	// eliminamos película por id
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") Long id) {
		peliculaServideImpl.eliminarPelicula(id);
	}

}
