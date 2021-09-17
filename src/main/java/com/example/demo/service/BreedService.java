package com.example.demo.service;

import com.example.demo.dao.BreedRepository;
import com.example.demo.domain.Breed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedService {

    @Autowired
    BreedRepository breedRepository;
    public List<Breed> getBreeds(){
       return breedRepository.findAll();
    }

}
