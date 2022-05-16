package com.peliculasSalas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peliculasSalas.dto.Pelicula;

// hacemos uso de JpaRepository (CRUD) sobre entidad Pelicula con PK (Long id)
public interface IPeliculaDAO extends JpaRepository<Pelicula, Long> {

}
