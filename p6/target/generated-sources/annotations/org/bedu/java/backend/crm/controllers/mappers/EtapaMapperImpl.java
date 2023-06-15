package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Etapa.EtapaBuilder;
import org.bedu.java.backend.crm.persistence.entities.Etapa;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T21:39:40-0600",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class EtapaMapperImpl implements EtapaMapper {

    @Override
    public Etapa etapaModelToEtapaEntity(org.bedu.java.backend.crm.model.Etapa etapaModel) {
        if ( etapaModel == null ) {
            return null;
        }

        Etapa etapa = new Etapa();

        etapa.setEtapaId( etapaModel.getEtapaId() );
        etapa.setNombre( etapaModel.getNombre() );
        etapa.setOrden( etapaModel.getOrden() );

        return etapa;
    }

    @Override
    public org.bedu.java.backend.crm.model.Etapa etapaEntityToEtapaModel(Etapa etapa) {
        if ( etapa == null ) {
            return null;
        }

        EtapaBuilder etapa1 = org.bedu.java.backend.crm.model.Etapa.builder();

        if ( etapa.getEtapaId() != null ) {
            etapa1.etapaId( etapa.getEtapaId() );
        }
        etapa1.nombre( etapa.getNombre() );
        if ( etapa.getOrden() != null ) {
            etapa1.orden( etapa.getOrden() );
        }

        return etapa1.build();
    }
}
