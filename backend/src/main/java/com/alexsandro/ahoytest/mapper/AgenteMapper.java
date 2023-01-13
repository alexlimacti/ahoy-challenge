package com.alexsandro.ahoytest.mapper;

import com.alexsandro.ahoytest.domain.Agente;
import com.alexsandro.ahoytest.dto.AgenteDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgenteMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Agente getAgente(AgenteDTO agenteDTO) {
        return modelMapper.map(agenteDTO, Agente.class);
    }

    public AgenteDTO getAgenteDTO(Agente agente) {
        return modelMapper.map(agente, AgenteDTO.class);
    }

    public List<AgenteDTO> getListAgentDTO(List<Agente> list) {
        List<AgenteDTO> dtos = new ArrayList<>();
        list.forEach(agente -> {
            dtos.add(getAgenteDTO(agente));
        });
        return dtos;
    }

    public List<Agente> getListAgent(List<AgenteDTO> list) {
        return list.stream().map(this::getAgente).collect(Collectors.toList());
    }


}
