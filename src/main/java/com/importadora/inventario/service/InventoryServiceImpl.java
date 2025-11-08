package com.importadora.inventario.service;

import com.importadora.inventario.model.Movimiento;
import com.importadora.inventario.model.Producto;
import com.importadora.inventario.repository.MovimientoRepository;
import com.importadora.inventario.repository.ProductoRepository;
import com.importadora.inventario.repository.ProveedorRepository;
import org.springframework.stereotype.Service; 
import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    // Dependencias inyectadas (Resuelve los errores de referencia estática)
    private final MovimientoRepository movimientoRepository;
    private final ProductoRepository productoRepository;
    // Inyección por Constructor (Spring usa esto para crear el bean)
    public InventoryServiceImpl(MovimientoRepository movimientoRepository, ProductoRepository productoRepository, ProveedorRepository proveedorRepository) {
        this.movimientoRepository = movimientoRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Movimiento> obtenerInventario() {
        return movimientoRepository.findAll(); 
    }

    @Override
    public Producto crearProducto(Producto producto) {
        // Solución de advertencia de nulidad (Null safety)
        return productoRepository.save(producto);
    }

    @Override
    public List<Movimiento> obtenerHistorial() {
        return movimientoRepository.findAll();
    }
    
    @Override
    public Movimiento registrarMovimiento(Movimiento movimiento) {
        // Solución de advertencia de nulidad (Null safety)
        return movimientoRepository.save(movimiento);
    }
}