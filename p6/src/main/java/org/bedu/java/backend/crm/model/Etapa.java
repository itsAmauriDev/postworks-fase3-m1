package org.bedu.java.backend.crm.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Data
@Builder
@RequiredArgsConstructor
public class Etapa {
    @PositiveOrZero(message = "El identificador de la etapa no puede ser un número negativo")
    private long etapaId;

    @NotEmpty(message = "El nombre de la etapa no puede estar en blanco.")
    @Size(min = 4, max = 30, message = "El nombre de la etapa debe tener entre 4 y 30 letras.")
    private String nombre;

    @Positive(message = "La etapa debe tener un orden positivo mayor a cero")
    private int orden;
}
