package com.example.demo.controller;

import com.example.demo.domain.Breed;
import com.example.demo.service.BreedService;
import com.mongodb.client.model.MergeOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


class BreedControllerTest {
    @Mock
    BreedService breedService;
    @InjectMocks
    BreedController breedController;

    @BeforeEach
    void init(){
        new BreedController();
    }

    @Test
    public void getBreedService() {
        Breed breed= new Breed();
        breed.setName("wofound");
           List<String> st= new ArrayList<>();
           st.add("austrilin");
           st.add("american");
           breed.setBreeds(st);
           List<Breed> breeds= new ArrayList<>();
           breeds.add(breed);
        when(breedService.getBreeds()).thenReturn(breeds);
        assertEquals(HttpStatus.OK,breedController.getAllBreeds().getStatusCode(),"check httpstatus");

    }
}