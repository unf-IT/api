package com.unfit.api.controllers;

import com.unfit.api.configuration.SwaggerConfig;
import com.unfit.api.converter.FrequentationConverter;
import com.unfit.api.dto.FrequentationDTO;
import com.unfit.api.model.Frequentation;
import com.unfit.api.repositories.FrequentationRepository;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/frequentations")
@Api(tags = { SwaggerConfig.FREQUENTATION })
public class FrequentationController {

    private static final Logger log = LoggerFactory.getLogger(FrequentationController.class);
    private final FrequentationConverter frequentationConverter;
    private final FrequentationRepository frequentationRepository;

    @Autowired
    public FrequentationController(FrequentationConverter frequentationConverter, FrequentationRepository frequentationRepository) {
        this.frequentationConverter = frequentationConverter;
        this.frequentationRepository = frequentationRepository;
    }

    @GetMapping
    public List<FrequentationDTO> findAll(){
        log.debug("IN");
        return frequentationConverter.entityToDTO((List<Frequentation>) frequentationRepository.findAll());
    }

    @PostMapping
    public void createFrequentation(@RequestBody FrequentationDTO frequentationDTO){
        log.debug("IN");
        frequentationRepository.save(frequentationConverter.dtoToEntity(frequentationDTO));
    }
}
