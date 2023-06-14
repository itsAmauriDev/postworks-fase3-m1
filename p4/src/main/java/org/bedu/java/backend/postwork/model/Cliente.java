package org.bedu.java.backend.postwork.model;

import jakarta.validation.constraints.*;

public class Cliente {
  @PositiveOrZero(message = "El id no puede ser negativo")
  private Long id;

  @NotEmpty(message = "El nombre no puede estar vacío")
  @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres")
  private String nombre;
  
  @Email(message = "El correo debe ser válido")
  private String correoContacto;

  @Min(value = 10, message = "Los clientes con menos de 10 empleados no son válidos")
  @Max(value = 10000, message = "Los clientes con más de 10000 empleados no son válidos")
  private String numeroEmpleados;

  @NotBlank(message = "Se debe proporcionar una dirección")
  private String direccion;
}
