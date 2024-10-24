package com.ParcialKarent.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ParcialKarent.app.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{

	Estudiante findByNumeroDocumentoAndNumeroRegistro(String numeroDocumento, String numeroRegistro);
	Estudiante findByNumeroDocumento(String numeroDocumento);
	
}
