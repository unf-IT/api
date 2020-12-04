package com.unfit.api.controllers;

import com.unfit.api.configuration.SwaggerConfig;
import com.unfit.api.converter.PrelevementConverter;

import com.unfit.api.dto.FrequentationDTO;
import com.unfit.api.dto.PrelevementDTO;
import com.unfit.api.model.Prelevement;
import com.unfit.api.repositories.PrelevementRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/prelevements")
@Api(tags = { SwaggerConfig.PRELEVEMENT })
public class PrelevementController {

    private static final Logger log = LoggerFactory.getLogger(FrequentationController.class);
    private final PrelevementConverter prelevementConverter;
    private final PrelevementRepository prelevementRepository;

    public PrelevementController(PrelevementConverter prelevementConverter, PrelevementRepository prelevementRepository) {
        this.prelevementConverter = prelevementConverter;
        this.prelevementRepository = prelevementRepository;
    }

    @GetMapping
    public List<PrelevementDTO> findAll(){
        log.debug("IN");
        return prelevementConverter.entityToDTO((List<Prelevement>) prelevementRepository.findAll());
    }

    @PostMapping
    public void createPrelevement(@RequestBody PrelevementDTO prelevementDTO){
        log.debug("IN");
        prelevementRepository.save(prelevementConverter.dtoToEntity(prelevementDTO));
    }

}
