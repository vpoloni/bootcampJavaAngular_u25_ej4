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
import com.peliculasSalas.dto.Sala;
import com.peliculasSalas.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServideImpl;

	// listar todas las salas
	@GetMapping("/salas")
	public List<Sala> listarSalas() {
		return salaServideImpl.listarSalas();
	}

	// crear nueva sala
	@PostMapping("/salas")
	public Sala crearSala(@RequestBody Sala sala) {
		return salaServideImpl.guardarSala(sala);
	}

	// listar sala por id
	@GetMapping("/salas/{id}")
	public Sala listarSalaXID(@PathVariable(name = "id") Long id) {

		Sala salaPorId = new Sala();
		salaPorId = salaServideImpl.listarSalaXID(id);
		return salaPorId;
	}

	// actualizar sala
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name = "id") Long id, @RequestBody Sala sala) {

		Sala salaSeleccionada = new Sala();
		Sala salaActualizada = new Sala();

		// obtenemos sala de la DB
		salaSeleccionada = salaServideImpl.listarSalaXID(id);

		// seteamos nuevos valores
		salaSeleccionada.setNombre(sala.getNombre());
		salaSeleccionada.setPelicula(sala.getPelicula());

		// actualizamos sala en la DB
		salaActualizada = salaServideImpl.actualizarSala(salaSeleccionada);

		return salaActualizada;
	}

	// eliminamos sala por id
	@DeleteMapping("/salas/{id}")
	public void eliminarsala(@PathVariable(name = "id") Long id) {
		salaServideImpl.eliminarSala(id);
	}

}
