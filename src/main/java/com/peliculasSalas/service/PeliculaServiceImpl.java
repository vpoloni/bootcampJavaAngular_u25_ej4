package com.peliculasSalas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peliculasSalas.dao.IPeliculaDAO;
import com.peliculasSalas.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	// hacemos uso de JpaRepository
	@Autowired
	IPeliculaDAO iPeliculaDAO;

	// desarrollamos los métodos de IPeliculaService
	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula listarPeliculaXID(Long id) {
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long id) {
		iPeliculaDAO.deleteById(id);

	}

}
