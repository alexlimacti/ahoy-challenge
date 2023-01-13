package com.alexsandro.ahoytest.service;

import com.alexsandro.ahoytest.domain.Agente;
import com.alexsandro.ahoytest.dto.AgentesDTO;
import com.alexsandro.ahoytest.mapper.AgenteMapper;
import com.alexsandro.ahoytest.repository.AgenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AgenteService {

    private final UploadXMLService uploadXMLService;
    private final AgenteMapper mapper;
    private final AgenteRepository agenteRepository;

    public void saveAgente(MultipartFile file) {
        AgentesDTO agentesDTO = uploadXMLService.readXMLFile(file);
        List<Agente> agentes = mapper.getListAgent(agentesDTO.getAgente().stream().toList());
        agentes.stream().map(Agente::getCodigo).forEach(System.out::println);
        agenteRepository.saveAll(agentes);
    }
}
