package com.unfit.api.converter;


import com.unfit.api.dto.WatermanDTO;
import com.unfit.api.model.Waterman;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WatermanConverter {

    public WatermanDTO entityToDTO(Waterman waterman){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(waterman, WatermanDTO.class);
    }

    public List<WatermanDTO> entityToDTO(List<Waterman> watermans) {
        return watermans.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    public Waterman dtoToEntity(WatermanDTO watermansDTO) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(watermansDTO, Waterman.class);
    }

    public List<Waterman> dtoToEntity(List<WatermanDTO> watermansDTOs) {
        return watermansDTOs.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
