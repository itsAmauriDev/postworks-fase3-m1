package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Cliente;
import org.bedu.java.backend.crm.model.Cliente.ClienteBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:39:40-0600",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public org.bedu.java.backend.crm.persistence.entities.Cliente clienteModelToClienteEntity(Cliente clienteModel) {
        if ( clienteModel == null ) {
            return null;
        }

        org.bedu.java.backend.crm.persistence.entities.Cliente cliente = new org.bedu.java.backend.crm.persistence.entities.Cliente();

        cliente.setId( clienteModel.getId() );
        cliente.setNombre( clienteModel.getNombre() );
        cliente.setCorreoContacto( clienteModel.getCorreoContacto() );
        cliente.setNumeroEmpleados( clienteModel.getNumeroEmpleados() );
        cliente.setDireccion( clienteModel.getDireccion() );

        return cliente;
    }

    @Override
    public Cliente clienteEntityToClienteModel(org.bedu.java.backend.crm.persistence.entities.Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteBuilder cliente1 = Cliente.builder();

        if ( cliente.getId() != null ) {
            cliente1.id( cliente.getId() );
        }
        cliente1.nombre( cliente.getNombre() );
        cliente1.correoContacto( cliente.getCorreoContacto() );
        cliente1.numeroEmpleados( cliente.getNumeroEmpleados() );
        cliente1.direccion( cliente.getDireccion() );

        return cliente1.build();
    }
}
