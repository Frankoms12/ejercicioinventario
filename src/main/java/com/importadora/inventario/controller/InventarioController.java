package com.importadora.inventario.controller;

import com.importadora.inventario.model.Movimiento;
import com.importadora.inventario.model.Producto;
import com.importadora.inventario.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    // Se elimina @Autowired, ya que Spring lo inyecta automáticamente por constructor.
    private final InventoryService inventoryService;

    // Constructor para inyección de dependencias
    public InventarioController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // Corregido: La variable espera List<Movimiento> si el servicio devuelve movimientos.
    @GetMapping("/movimientos")
    public ResponseEntity<List<Movimiento>> obtenerInventario() {
        List<Movimiento> movimientos = inventoryService.obtenerInventario(); // <--- Aquí la corrección de tipo
        return ResponseEntity.ok(movimientos);
    }
    
    @PostMapping("/productos")
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        Producto nuevoProducto = inventoryService.crearProducto(producto);
        return ResponseEntity.ok(nuevoProducto);
    }

    // Corregido: Uso del método registrarMovimiento()
    @PostMapping("/movimiento")
    public ResponseEntity<Movimiento> registrarMovimiento(@RequestBody Movimiento movimiento) {
        Movimiento nuevoMovimiento = inventoryService.registrarMovimiento(movimiento);
        return ResponseEntity.ok(nuevoMovimiento);
    }

    @GetMapping("/historial")
    public ResponseEntity<List<Movimiento>> obtenerHistorial() {
        List<Movimiento> historial = inventoryService.obtenerHistorial();
        return ResponseEntity.ok(historial);
    }
}