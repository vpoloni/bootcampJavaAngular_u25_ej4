package com.peliculasSalas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculasSalas.dao.ISalaDAO;

import com.peliculasSalas.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	// hacemos uso de JpaRepository
	@Autowired
	ISalaDAO iSalaDAO;

	// desarrollamos los métodos de ISalaService
	@Override
	public List<Sala> listarSalas() {

		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {

		return iSalaDAO.save(sala);
	}

	@Override
	public Sala listarSalaXID(Long id) {

		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {

		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long id) {
		iSalaDAO.deleteById(id);

	}

}
