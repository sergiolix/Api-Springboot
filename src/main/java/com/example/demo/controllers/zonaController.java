package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.zonaModel;
import com.example.demo.services.zonaServices;

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
}
