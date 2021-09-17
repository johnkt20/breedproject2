package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Breed {
    @Id
    private String name;
    private List<String> breeds;

    public Breed() {
    }
    public Breed(String name, List<String> breeds) {
        this.name = name;
        this.breeds = breeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }
}
