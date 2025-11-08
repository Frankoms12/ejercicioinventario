package com.importadora.inventario.service;

import com.importadora.inventario.model.Movimiento;
import com.importadora.inventario.model.Producto;
import java.util.List;

public interface InventoryService {

    // Corrige el error: The method obtenerInventario() is undefined
    List<Movimiento> obtenerInventario(); 
    
    // Corrige el error: The method crearProducto(Producto) is undefined
    Producto crearProducto(Producto producto);

    // Corrige el error: The method obtenerHistorial() is undefined
    List<Movimiento> obtenerHistorial();
    
    // Aquí puedes añadir más métodos de negocio
    // Dentro de la interfaz InventoryService
Movimiento registrarMovimiento(Movimiento movimiento);
}