package com.unfit.api.converter;

import com.unfit.api.dto.SessionDTO;
import com.unfit.api.model.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

@Component
public class SessionConverter {
    private static final Logger LOG = LoggerFactory.getLogger(SessionConverter.class);

    public SessionDTO entityToDTO(Session session){
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(session,SessionDTO.class);
    }
    
}
