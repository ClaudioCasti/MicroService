package com.example.uber.vehiculos.model;

public class Vehiculo {

    private Long id;
    private TipoVehiculo tipo;
    private String marca;
    private String modelo;
    private EstadoVehiculo estado;
    private String ubicacion;

    public Vehiculo() {}

    public Vehiculo(Long id, TipoVehiculo tipo, String marca, String modelo, EstadoVehiculo estado, String ubicacion) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    // getters y setters
}