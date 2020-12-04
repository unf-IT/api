package com.unfit.api.converter;

import com.unfit.api.dto.PrelevementDTO;
import com.unfit.api.model.Prelevement;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PrelevementConverter {

    public PrelevementDTO entityToDTO(Prelevement prelevement){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(prelevement, PrelevementDTO.class);
    }

    public List<PrelevementDTO> entityToDTO(List<Prelevement> prelevements) {
        return prelevements.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Prelevement dtoToEntity(PrelevementDTO prelevementDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(prelevementDTO, Prelevement.class);
    }

    public List<Prelevement> dtoToEntity(List<PrelevementDTO> prelevementDTOs) {
        return prelevementDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
