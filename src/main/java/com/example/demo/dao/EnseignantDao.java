package com.example.demo.dao;


import com.example.demo.model.Enseignant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EnseignantDao extends MongoRepository<Enseignant, Long> {

    /**
     * @param name
     * @return Enseignant
     */
    List<Enseignant> findByNameLike(String name);
}
