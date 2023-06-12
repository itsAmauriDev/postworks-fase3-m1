package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.bedu.java.backend.postwork.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
  
  @GetMapping("/{productoId}")
  public ResponseEntity<Producto> getProducto(@PathVariable Long productoId){
    return ResponseEntity.ok(new Producto());
  }

  @GetMapping
  public ResponseEntity<List<Producto>> getProductos(){
    return ResponseEntity.ok(new ArrayList<>());
  }

  @PostMapping
  public ResponseEntity<Void> createProducto(@RequestBody Producto producto){
    return ResponseEntity.created(URI.create("")).build();
  }

  @PutMapping("/{productoId}")
  public ResponseEntity<Producto> updateProducto(@PathVariable Long productoId, @RequestBody Producto producto){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/{productoId}")
  public ResponseEntity<Void> deleteProducto(@PathVariable Long productoId){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
