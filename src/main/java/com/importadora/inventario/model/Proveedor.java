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
public class Proveedor {

    @Id // <-- ¡Necesario para JPA!
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String contacto;
    private String telefono;
}