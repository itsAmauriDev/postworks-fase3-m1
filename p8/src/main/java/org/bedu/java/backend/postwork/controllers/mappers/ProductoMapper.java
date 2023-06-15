package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.entities.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    Producto productoModelToProductoEntity(org.bedu.java.backend.crm.model.Producto productoModel);

    org.bedu.java.backend.crm.model.Producto productoEntityToProductoModel(Producto producto);
}
