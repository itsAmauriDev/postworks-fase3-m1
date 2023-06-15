package org.bedu.java.backend.postwork.controllers.mappers;

import org.bedu.java.backend.postwork.persistence.entities.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    Etapa etapaModelToEtapaEntity(org.bedu.java.backend.crm.model.Etapa etapaModel);

    org.bedu.java.backend.crm.model.Etapa etapaEntityToEtapaModel(Etapa etapa);
}
