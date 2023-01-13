package com.alexsandro.ahoytest.mapper;

import com.alexsandro.ahoytest.domain.Regiao;
import com.alexsandro.ahoytest.dto.RegiaoDTO;
import com.alexsandro.ahoytest.dto.RegiaoGetDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RegiaoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Regiao getRegiao(RegiaoDTO regiaoDTO) {
        return modelMapper.map(regiaoDTO, Regiao.class);
    }

    public RegiaoDTO getRegiaoDTO(Regiao regiao) {
        return modelMapper.map(regiao, RegiaoDTO.class);
    }

    private RegiaoGetDTO getRegiaoGetDTO(Regiao regiao) {
        return modelMapper.map(regiao, RegiaoGetDTO.class);
    }

    public List<RegiaoDTO> getListRegiaoDTO(List<Regiao> list) {
        return list.stream().map(this::getRegiaoDTO).collect(Collectors.toList());
    }

    public List<RegiaoGetDTO> getListRegiaoGetDTO(List<Regiao> list) {
        return list.stream().map(this::getRegiaoGetDTO).collect(Collectors.toList());
    }

}
