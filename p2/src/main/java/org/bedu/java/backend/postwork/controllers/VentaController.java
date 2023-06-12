package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.bedu.java.backend.postwork.model.Venta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venta")
public class VentaController {
  
  @GetMapping("/{ventaId}")
  public ResponseEntity<Venta> getVenta(@PathVariable Long ventaId){
    return ResponseEntity.ok(new Venta());
  }

  @GetMapping
  public ResponseEntity<List<Venta>> getVentas(@RequestParam Long clienteId){
    return ResponseEntity.ok(new ArrayList<>());
  }

  @PostMapping
  public ResponseEntity<Void> createVenta(@RequestBody Venta venta, @RequestParam Long clienteId){
    return ResponseEntity.created(URI.create("")).build();
  }

  @PutMapping("/{ventaId}")
  public ResponseEntity<Void> updateVenta(@PathVariable Long ventaId, @RequestBody Venta venta){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/{ventaId}")
  public ResponseEntity<Void> deleteVenta(@PathVariable Long ventaId){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
