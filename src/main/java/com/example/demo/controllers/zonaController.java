package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.zonaModel;
import com.example.demo.services.zonaServices;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/zonas_deforestadas")
public class zonaController {

    @Autowired()
    zonaServices zonaService;

    @GetMapping()
    public ArrayList<zonaModel> obtenerZonas() {
        return zonaService.obtenerZonas();
    }

    @PostMapping()
    public zonaModel guardarZonas(@RequestBody zonaModel zona) {
        return this.zonaService.guardarZonas(zona);
    }

    @GetMapping(path = "/{id}")
    public Optional<zonaModel> obtenerporid(@PathVariable("id") Long id) {
        return this.zonaService.obtnerporid(id);
    }

    @GetMapping("/query")
    public ArrayList<zonaModel> obtnerbyubicacion(@RequestParam("ubicacion") String ubicacion) {
        return zonaService.obtenerbyubicacion(ubicacion);
    }
}
