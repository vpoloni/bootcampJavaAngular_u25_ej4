package com.peliculasSalas.service;

import java.util.List;
import com.peliculasSalas.dto.Sala;

//interface con los métodos CRUD
public interface ISalaService {

	// READ todas salas
	public List<Sala> listarSalas();

	// CREATE nueva sala
	public Sala guardarSala(Sala sala);

	// READ sala por id
	public Sala listarSalaXID(Long id);

	// UPDATE sala
	public Sala actualizarSala(Sala sala);

	// DELETE sala
	public void eliminarSala(Long id);

}
