package com.importadora.inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data; 
import lombok.NoArgsConstructor; 
import java.time.LocalDateTime; // <--- ¡LA IMPORTACIÓN FALTANTE!

@Entity
@Data
@NoArgsConstructor 
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    private TipoMovimiento tipo; 
    private Long productoId; 
    private Long proveedorId; 
    private int cantidad;
    private String referencia; 
    private LocalDateTime fechaMovimiento = LocalDateTime.now();
}