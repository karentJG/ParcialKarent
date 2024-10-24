package com.ParcialKarent.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ParcialKarent.app.entity.Calificacion;
import com.ParcialKarent.app.entity.Estudiante;

public interface CalificacionRepository extends MongoRepository<Calificacion, String>{
	Calificacion findByEstudiante(Estudiante estudiante);
}
