package com.example.demo.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "ZonasDeforestadas")
public class zonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;
    private String nombre;
    private String ubicacion;
    private String superficie;
    private Date FechaDeforestacion;
    private String causas;
    private String impactosambientales;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public Date getFechaDeforestacion() {
        return FechaDeforestacion;
    }

    public void setFechaDeforestacion(Date fechaDeforestacion) {
        FechaDeforestacion = fechaDeforestacion;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getImpactosambientales() {
        return impactosambientales;
    }

    public void setImpactosambientales(String impactosambientales) {
        this.impactosambientales = impactosambientales;
    }
}
