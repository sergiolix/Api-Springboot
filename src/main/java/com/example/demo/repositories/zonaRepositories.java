package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.zonaModel;

@Repository
public interface zonaRepositories extends CrudRepository<zonaModel, Long> {
    public abstract ArrayList<zonaModel> findbyUbicacion(String ubicacion);
}
