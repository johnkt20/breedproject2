package com.example.demo.dao;

import com.example.demo.domain.Breed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BreedRepository extends MongoRepository<Breed, String> {
}
