package com.alexsandro.ahoytest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;

@Setter
@Getter
@ToString
@NoArgsConstructor(force = true)
public class AgentesDTO {

    private final String versao;
    private final Collection<AgenteDTO> agente;

}
