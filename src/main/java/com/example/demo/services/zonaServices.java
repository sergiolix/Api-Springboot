package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.zonaModel;
import com.example.demo.repositories.zonaRepositories;

@Service
public class zonaServices {

    @Autowired
    zonaRepositories zonaRepositories;

    public ArrayList<zonaModel> obtenerZonas() {
        return (ArrayList<zonaModel>) zonaRepositories.findAll();
    }

    public zonaModel guardarZonas(zonaModel zona) {
        return zonaRepositories.save(zona);
    }
}
