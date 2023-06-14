package org.bedu.java.backend.postwork.model.builders;

import java.util.HashMap;
import java.util.Map;

import org.bedu.java.backend.postwork.model.RespuestaError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class RespuestaErrorBuilder {
  private int estatus;
  private String mensaje;
  private String ruta;
  private Map<String, String> errores;

  public RespuestaErrorBuilder estatus(int estatus) {
    this.estatus = estatus;
    return this;
  }

  public RespuestaErrorBuilder status(HttpStatus estatus) {
    this.estatus = estatus.value();

    if (estatus.isError()) {
      this.errores.put("error", estatus.getReasonPhrase());
    }

    return this;
  }

  public RespuestaErrorBuilder mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  public RespuestaErrorBuilder ruta(String ruta) {
    this.ruta = ruta;
    return this;
  }

  public RespuestaErrorBuilder errores(Map<String, String> errores) {
    this.errores = errores;
    return this;
  }

  public RespuestaErrorBuilder exception(MethodArgumentNotValidException ex) {
    HttpStatus status = HttpStatus.BAD_REQUEST;
    this.estatus = status.value();

    errores = new HashMap<>();

    ex.getBindingResult().getAllErrors().forEach(error -> {
      String fieldName = ((FieldError) error).getField();
      String errorMessage = error.getDefaultMessage();
      errores.put(fieldName, errorMessage);
    });

    return this;
  }

  public RespuestaError build() {
    RespuestaError respuestaError = new RespuestaError();
    respuestaError.setEstatus(estatus);
    respuestaError.setMensaje(mensaje);
    respuestaError.setRuta(ruta);
    respuestaError.setErrores(errores);
    return respuestaError;
  }

  public ResponseEntity<RespuestaError> entidad() {
    return ResponseEntity.status(estatus).headers(HttpHeaders.EMPTY).body(build());
  }
}

