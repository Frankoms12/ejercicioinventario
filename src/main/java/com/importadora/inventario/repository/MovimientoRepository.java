package com.importadora.inventario.repository;

import com.importadora.inventario.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}