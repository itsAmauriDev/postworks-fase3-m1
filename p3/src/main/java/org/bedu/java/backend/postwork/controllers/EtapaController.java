package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.bedu.java.backend.postwork.model.Etapa;
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

import jakarta.validation.Valid;

@RestController
@RequestMapping("/etapa")
public class EtapaController {
  
  @GetMapping("/{etapaId}")
  public ResponseEntity<Etapa> getEtapa(@PathVariable Long etapaId){
    return ResponseEntity.ok(new Etapa());
  }

  @GetMapping
  public ResponseEntity<List<Etapa>> getEtapas(@Valid @RequestParam Long clienteId){
    return ResponseEntity.ok(new ArrayList<>());
  }

  @PostMapping
  public ResponseEntity<Void> createEtapa(@Valid @RequestBody Etapa etapa, @RequestParam Long clienteId){
    return ResponseEntity.created(URI.create("")).build();
  }

  @PutMapping("/{etapaId}")
  public ResponseEntity<Etapa> updateEtapa(@PathVariable Long etapaId, @Valid @RequestBody Etapa etapa){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/{etapaId}")
  public ResponseEntity<Void> deleteEtapa(@PathVariable Long etapaId){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
