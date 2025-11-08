package com.importadora.inventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data; 
import lombok.NoArgsConstructor; 

@Entity // <-- ¡Necesario para JPA!
@Data
@NoArgsConstructor // Necesario para JPA
public class Producto {

    @Id // <-- ¡Necesario para JPA!
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    private String nombre;
    private String descripcion;
    private int stock; // El stock actual del producto
    private double precio;
}