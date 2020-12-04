package com.unfit.api.controllers;

import com.unfit.api.configuration.SwaggerConfig;
import com.unfit.api.converter.WatermanConverter;
import com.unfit.api.dto.WatermanDTO;
import com.unfit.api.model.Waterman;
import com.unfit.api.repositories.WatermanRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/watermen")
@Api(tags = { SwaggerConfig.WATERMEN})
public class WatermanController {

    private static final Logger LOG = LoggerFactory.getLogger(WatermanController.class);
    private final WatermanRepository watermanRepository;
    private final WatermanConverter watermanConverter;

    public WatermanController(WatermanRepository watermanRepository, WatermanConverter watermanConverter) {
        this.watermanRepository = watermanRepository;
        this.watermanConverter = watermanConverter;
    }

    @ApiOperation(value = "La liste des mouillés :) .")
    @GetMapping
    public List<WatermanDTO> findAll(){
        LOG.debug("IN");
        return watermanConverter.entityToDTO((List<Waterman>) watermanRepository.findAll());
    }

    @ApiOperation(value = "Envoi des watermen :).")
    @PostMapping
    public void createWaterman(@RequestBody WatermanDTO watermanDTO){
        LOG.debug("IN");
        watermanRepository.save(watermanConverter.dtoToEntity(watermanDTO));
    }
}
