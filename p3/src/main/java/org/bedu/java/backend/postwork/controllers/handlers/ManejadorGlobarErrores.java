package org.bedu.java.backend.postwork.controllers.handlers;

import org.bedu.java.backend.postwork.model.RespuestaError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ManejadorGlobarErrores {
  
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> handleStatusException(MethodArgumentNotValidException ex, WebRequest request){
    
    return  RespuestaError.builder()
            .exception(ex)
            .mensaje("Ocurrio un error en la validación de los datos")
            .ruta(request.getDescription(false).substring(4))
            .entidad();
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleException(Exception ex, WebRequest request){
    
    return  RespuestaError.builder()
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .mensaje("Ocurrio un error sl procesar la petición")
            .ruta(request.getDescription(false).substring(4))
            .entidad();
  }
}
