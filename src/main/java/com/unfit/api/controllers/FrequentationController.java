package com.unfit.api.controllers;

import com.unfit.api.converter.FrequentationConverter;
import com.unfit.api.repositories.FrequentationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/frequentations")
public class FrequentationController {

    private static final Logger log = LoggerFactory.getLogger(FrequentationController.class);
    private final FrequentationConverter frequentationConverter;
    private final FrequentationRepository frequentationRepository;

    @Autowired
    public FrequentationController(FrequentationConverter frequentationConverter, FrequentationRepository frequentationRepository) {
        this.frequentationConverter = frequentationConverter;
        this.frequentationRepository = frequentationRepository;
    }

}
