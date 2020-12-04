package com.unfit.api.controllers;

import com.unfit.api.configuration.SwaggerConfig;
import com.unfit.api.converter.SessionConverter;
import com.unfit.api.dto.SessionDTO;
import com.unfit.api.model.Session;
import com.unfit.api.repositories.SessionRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/administratifs")
@Api(tags = { SwaggerConfig.SESSION })
public class SessionController {
    private static final Logger LOG = LoggerFactory.getLogger(SessionController.class);
    private final SessionRepository sessionRepository;
    private final SessionConverter sessionConverter;

    @Autowired
    public SessionController(SessionRepository sessionRepository, SessionConverter sessionConverter) {
        this.sessionRepository = sessionRepository;
        this.sessionConverter = sessionConverter;
    }

    @ApiOperation(value = "Récupère toutes les sessions.")
    @GetMapping
    public List<SessionDTO> findAll(){
        LOG.debug("IN");
        return sessionConverter.entityToDTO((List<Session>) sessionRepository.findAll());
    }

    @ApiOperation(value = "Enregistrement d'une session.")
    @PostMapping
    public void createSession(@RequestBody SessionDTO sessionDTO){
        LOG.debug("IN");
        sessionRepository.save(sessionConverter.dtoToEntity(sessionDTO));
    }
}
