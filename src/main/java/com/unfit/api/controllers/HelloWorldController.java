package com.unfit.api.controllers;

import com.unfit.api.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello-world")
@Api(tags = { SwaggerConfig.HELLO })
public class HelloWorldController {

    @ApiOperation(value = "Un petit bonjour par ici.")
    @GetMapping
    public String findAll(){
        return "Hello Surfeur :)";
    }
}
