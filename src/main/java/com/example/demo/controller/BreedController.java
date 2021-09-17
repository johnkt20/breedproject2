package com.example.demo.controller;

import com.example.demo.domain.Breed;
import com.example.demo.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/breeds")
public class BreedController {

    @Autowired
    BreedService breedService;

    @GetMapping("/list/all")
    public ResponseEntity<?> getAllBreeds(){
        List<Breed> breedList= breedService.getBreeds();
        return new ResponseEntity<>(breedList, HttpStatus.OK);
    }
}
