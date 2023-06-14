package org.bedu.java.backend.postwork.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.bedu.java.backend.postwork.model.builders.RespuestaErrorBuilder;

public class RespuestaError {
  private final LocalDateTime timestamp = LocalDateTime.now();
  private int estatus;
  private String mensaje;
  private String ruta;
  private Map<String, String> errores;

  public static RespuestaErrorBuilder builder(){
    return new RespuestaErrorBuilder();
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public int getEstatus() {
    return estatus;
  }

  public void setEstatus(int estatus) {
    this.estatus = estatus;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  public String getRuta() {
    return ruta;
  }

  public void setRuta(String ruta) {
    this.ruta = ruta;
  }

  public Map<String, String> getErrores() {
    return errores;
  }
  
  public void setErrores(Map<String, String> errores) {
    this.errores = errores;
  }
}
