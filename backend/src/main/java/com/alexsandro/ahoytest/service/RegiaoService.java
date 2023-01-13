package com.alexsandro.ahoytest.service;

import com.alexsandro.ahoytest.domain.Agente;
import com.alexsandro.ahoytest.domain.Regiao;
import com.alexsandro.ahoytest.dto.RegiaoDTO;
import com.alexsandro.ahoytest.dto.RegiaoGetDTO;
import com.alexsandro.ahoytest.mapper.RegiaoMapper;
import com.alexsandro.ahoytest.repository.RegiaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RegiaoService {

    private final RegiaoRepository regiaoRepository;
    private final RegiaoMapper regiaoMapper;

    public List<RegiaoGetDTO> findBySigla(String sigla) {
        return regiaoMapper.getListRegiaoGetDTO(regiaoRepository.findBySigla(sigla));
    }

}
