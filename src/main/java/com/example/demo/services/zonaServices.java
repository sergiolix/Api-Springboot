package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.zonaModel;
import com.example.demo.repositories.zonaRepositories;

@Service
public class zonaServices {

    @Autowired
    zonaRepositories zonaRepositorie;

    public ArrayList<zonaModel> obtenerZonas() {
        return (ArrayList<zonaModel>) zonaRepositorie.findAll();
    }

    public zonaModel guardarZonas(zonaModel zona) {
        return zonaRepositorie.save(zona);
    }

    public Optional<zonaModel> obtnerporid(long id) {
        return zonaRepositorie.findById(id);
    }

    public ArrayList<zonaModel> obtenerbyubicacion(String ubicacion) {
        return zonaRepositorie.findByUbicacion(ubicacion);
    }
}
