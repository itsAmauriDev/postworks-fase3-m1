package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.bedu.java.backend.postwork.model.Visita;
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
@RequestMapping("/visita")
public class VisitaController {
  
  @GetMapping("/{visitaId}")
  public ResponseEntity<Visita> getVisita(@PathVariable Long visitaId){
    return ResponseEntity.ok(new Visita());
  }

  @GetMapping
  public ResponseEntity<List<Visita>> getVisitas(@RequestParam Long clienteId){
    return ResponseEntity.ok(new ArrayList<>());
  }

  @PostMapping
  public ResponseEntity<Void> createVisita(@RequestBody Visita visita, @RequestParam Long clienteId){
    return ResponseEntity.created(URI.create("")).build();
  }

  @PutMapping("/{visitaId}")
  public ResponseEntity<Void> updateVisita(@PathVariable Long visitaId, @RequestBody Visita visita){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/{visitaId}")
  public ResponseEntity<Void> deleteVisita(@PathVariable Long visitaId){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

}
