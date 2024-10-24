package com.ParcialKarent.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ParcialKarent.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String>{
	
	Coordinador findByUserAndPassword(String user, String password);
}
