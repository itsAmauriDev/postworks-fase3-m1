package org.bedu.java.backend.postwork.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.bedu.java.backend.postwork.model.Cliente;
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

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
  
  @GetMapping("/{clienteId}")
  public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId){
    return ResponseEntity.ok(new Cliente());
  }

  @GetMapping
  public ResponseEntity<List<Cliente>> getClientes(){
    return ResponseEntity.ok(new ArrayList<>());
  }

  @PostMapping
  public ResponseEntity<Void> createCliente(@Valid @RequestBody Cliente cliente){
    return ResponseEntity.created(URI.create("")).build();
  }

  @PutMapping("/{clienteId}")
  public ResponseEntity<Void> updateCliente(@PathVariable Long clienteId, @RequestBody @Valid Cliente cliente){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

  @DeleteMapping("/{clienteId}")
  public ResponseEntity<Void> deleteCliente(@PathVariable Long clienteId){
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}