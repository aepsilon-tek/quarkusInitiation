package org.aepsilon.culturetek.quarkus.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.aepsilon.culturetek.quarkus.model.PaysEnum;
import org.jboss.logging.Logger;

@Converter(autoApply = false)
public class PaysEnumConverter implements AttributeConverter<PaysEnum, String> {
    private static final Logger LOG = Logger.getLogger(PaysEnumConverter.class);
    @Override
    public String convertToDatabaseColumn(PaysEnum pays) {
        LOG.debug("********** convertToDatabaseColumn with "+pays);
        if (pays == null) {
            return null;
        }
        return pays.getAbreviation();
    }

    @Override
    public PaysEnum convertToEntityAttribute(String abbreviation) {
        LOG.debug("********** convertToEntityAttribute with "+abbreviation);
        if (abbreviation == null) {
            return null;
        }

        return PaysEnum.valueOfByAbreviation(abbreviation);
    }
}