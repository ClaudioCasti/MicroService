package com.example.uber.vehiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uber.vehiculos.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}