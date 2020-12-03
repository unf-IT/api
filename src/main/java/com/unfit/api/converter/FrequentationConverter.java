package com.unfit.api.converter;

import com.unfit.api.dto.FrequentationDTO;
import com.unfit.api.model.Frequentation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FrequentationConverter {

    public FrequentationDTO entityToDTO(Frequentation frequentation){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(frequentation, FrequentationDTO.class);
    }

    public List<FrequentationDTO> entityToDTO(List<Frequentation> frequentations) {
        return frequentations.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Frequentation dtoToEntity(FrequentationDTO frequentationDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(frequentationDTO, Frequentation.class);
    }

    public List<Frequentation> dtoToEntity(List<FrequentationDTO> frequentationDTOs) {
        return frequentationDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
