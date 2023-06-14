package org.bedu.java.backend.postwork.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.validation.constraints.*;

public class Venta {
  @PositiveOrZero(message = "El id no puede ser negativo")
  private Long id;
  
  @DecimalMin(value = "1.00", inclusive = false, message = "El monto debe ser al menos 1.00")
  private float monto;

  @NotEmpty(message = "La lista de productos no puede estar vacía")
  private List<Producto> productos;

  @NotNull(message = "La venta debe tener un cliente asociado")
  private Cliente cliente;

  @PastOrPresent(message = "La fecha de creación no puede ser futura")
  private LocalDateTime fechaCreacion;
}
