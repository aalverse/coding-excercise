package com.simpleapi.simpleapi.service;

import com.simpleapi.simpleapi.identity.DogType;
import com.simpleapi.simpleapi.repository.DogTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private DogTypeRepository dogTypeRepository;

    public DogService(DogTypeRepository dogTypeRepository) {
        this.dogTypeRepository = dogTypeRepository;
    }

    public Iterable<DogType> list() {
        return dogTypeRepository.findAll();
    }

    public DogType save(DogType dog) {
        return dogTypeRepository.save(dog);
    }

    public void save(List<DogType> dog) {
        dogTypeRepository.saveAll(dog);
    }

}