package com.alexsandro.ahoytest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor(force = true)
public class AgenteDTO {

    private Long codigo;

    private Date data;

    private Collection<RegiaoDTO> regiao;

}
