package com.unfit.api.converter;

import com.unfit.api.dto.SessionDTO;
import com.unfit.api.model.Session;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SessionConverter {
    private static final Logger LOG = LoggerFactory.getLogger(SessionConverter.class);

    public SessionDTO entityToDTO(Session session){
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(session,SessionDTO.class);
    }

    public List<SessionDTO> entityToDTO(List<Session> sessions){
        LOG.debug("IN");
        return sessions.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Session dtoToEntity(SessionDTO sessionDTO){
        LOG.debug("IN");
        ModelMapper mapper = new ModelMapper();
        return mapper.map(sessionDTO,Session.class);
    }

    public List<Session> dtoToEntity(List<SessionDTO> sessionDTOList){
        LOG.debug("IN");
        return sessionDTOList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
