package org.bedu.java.backend.postwork.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.*;

public class Visita {
  @PositiveOrZero(message = "El id no puede ser negativo")
  private long id;

  @NotNull(message = "La visita debe tener un cliente asociado")
  private Cliente cliente;

  @Future(message = "La fecha de la visita debe ser futura")
  private LocalDateTime fechaProgramada;

  @NotEmpty(message = "La dirección no puede estar vacía")
  @Size(min = 10, message = "La dirección debe tener al menos 10 caracteres")
  private String direccion;

  @NotEmpty(message = "El propósito de la visita no puede estar vacío")
  @Size(min = 15, message = "El propósito de la visita debe tener al menos 15 caracteres")
  private String proposito;

  @NotEmpty(message = "El nombre del vendedor no puede estar vacío")
  @Size(min = 5, max = 30, message = "El nombre del vendedor debe tener entre 5 y 30 caracteres")
  private String vendedor;
}
