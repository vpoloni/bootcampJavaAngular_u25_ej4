package com.peliculasSalas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.peliculasSalas.dto.Sala;

//hacemos uso de JpaRepository (CRUD) sobre entidad Sala con PK (Long id)
public interface ISalaDAO extends JpaRepository<Sala, Long> {

}
