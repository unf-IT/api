package com.unfit.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public static final String FREQUENTATION="La frequentation dans et sur l'eau.";
    public static final String PRELEVEMENT="Pollution rencontrée.";
    public static final String SESSION="Une belle session de sport en mer: la gestion c'est ici!.";
    public static final String WATERMEN="Les femmes et des hommes de l'eau!.";
    public static final String HELLO="On commence par se dire bonjour.";
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.unfit.api.controllers"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag(FREQUENTATION,"Les 'rencontres' dans l'eau et sur l'eau."))
                .tags(new Tag(PRELEVEMENT,"Les 'moins bonnes' rencontres dans l'eau et sur l'eau."))
                .tags(new Tag(SESSION,"Une belle session de sport en mer: par ici!."))
                .tags(new Tag(WATERMEN,"Téthys ou Poséidon , les pratiquants se trouve dans cette antre."))
                .tags(new Tag(HELLO,"Tout commence par un Hello."))
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("unf-IT").version("0.0.1-SNAPSHOT").build();
    }
}