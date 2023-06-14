package org.bedu.java.backend.postwork.model;

import jakarta.validation.constraints.*;

public class Etapa {
  @PositiveOrZero(message = "El id no puede ser negativo")
  private Long id;

  @NotEmpty(message = "El nombre no puede estar vacío")
  @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres")
  private String nombre;

  @Positive(message = "El orden debe ser un número mayor a cero")
  private int orden;
}
