package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Cliente;
import org.bedu.java.backend.crm.model.Cliente.ClienteBuilder;
import org.bedu.java.backend.crm.model.Visita;
import org.bedu.java.backend.crm.model.Visita.VisitaBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:39:40-0600",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class VisitaMapperImpl implements VisitaMapper {

    @Override
    public org.bedu.java.backend.crm.persistence.entities.Visita visitaModelToVisitaEntity(Visita visitaModel) {
        if ( visitaModel == null ) {
            return null;
        }

        org.bedu.java.backend.crm.persistence.entities.Visita visita = new org.bedu.java.backend.crm.persistence.entities.Visita();

        visita.setId( visitaModel.getId() );
        visita.setCliente( clienteToCliente( visitaModel.getCliente() ) );
        visita.setFechaProgramada( visitaModel.getFechaProgramada() );
        visita.setDireccion( visitaModel.getDireccion() );
        visita.setProposito( visitaModel.getProposito() );
        visita.setVendedor( visitaModel.getVendedor() );

        return visita;
    }

    @Override
    public Visita visitaEntityToVisitaModel(org.bedu.java.backend.crm.persistence.entities.Visita visita) {
        if ( visita == null ) {
            return null;
        }

        VisitaBuilder visita1 = Visita.builder();

        visita1.id( visita.getId() );
        visita1.cliente( clienteToCliente1( visita.getCliente() ) );
        visita1.fechaProgramada( visita.getFechaProgramada() );
        visita1.direccion( visita.getDireccion() );
        visita1.proposito( visita.getProposito() );
        visita1.vendedor( visita.getVendedor() );

        return visita1.build();
    }

    protected org.bedu.java.backend.crm.persistence.entities.Cliente clienteToCliente(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        org.bedu.java.backend.crm.persistence.entities.Cliente cliente1 = new org.bedu.java.backend.crm.persistence.entities.Cliente();

        cliente1.setId( cliente.getId() );
        cliente1.setNombre( cliente.getNombre() );
        cliente1.setCorreoContacto( cliente.getCorreoContacto() );
        cliente1.setNumeroEmpleados( cliente.getNumeroEmpleados() );
        cliente1.setDireccion( cliente.getDireccion() );

        return cliente1;
    }

    protected Cliente clienteToCliente1(org.bedu.java.backend.crm.persistence.entities.Cliente cliente) {
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
