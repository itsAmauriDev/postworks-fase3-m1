package org.bedu.java.backend.postwork.model;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

public class Producto {
  @PositiveOrZero
  private Long id;

  @NotEmpty(message = "El nombre no puede estar vacío")
  @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres")
  private String nombre;

  private String categoria;

  @DecimalMin(value = "1.00", inclusive = false, message = "El precio debe ser al menos 1.00")
  private float precio;

  @NotEmpty(message = "El número de registro no puede estar vacío")
  @Pattern(regexp = "^(\\d{3}-){2}\\d{4}$", message = "El número de registro debe tener el formato 000-000-0000")
  private String numeroRegistro;

  @PastOrPresent(message = "La fecha de creación no puede ser futura")
  private LocalDate fechaCreacion;
}
