package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Producto.ProductoBuilder;
import org.bedu.java.backend.crm.persistence.entities.Producto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:39:40-0600",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public Producto productoModelToProductoEntity(org.bedu.java.backend.crm.model.Producto productoModel) {
        if ( productoModel == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoModel.getId() );
        producto.setNombre( productoModel.getNombre() );
        producto.setCategoria( productoModel.getCategoria() );
        producto.setPrecio( productoModel.getPrecio() );
        producto.setNumeroRegistro( productoModel.getNumeroRegistro() );
        producto.setFechaCreacion( productoModel.getFechaCreacion() );

        return producto;
    }

    @Override
    public org.bedu.java.backend.crm.model.Producto productoEntityToProductoModel(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoBuilder producto1 = org.bedu.java.backend.crm.model.Producto.builder();

        if ( producto.getId() != null ) {
            producto1.id( producto.getId() );
        }
        producto1.nombre( producto.getNombre() );
        producto1.categoria( producto.getCategoria() );
        producto1.precio( producto.getPrecio() );
        producto1.numeroRegistro( producto.getNumeroRegistro() );
        producto1.fechaCreacion( producto.getFechaCreacion() );

        return producto1.build();
    }
}
