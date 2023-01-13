package com.alexsandro.ahoytest.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor(force = true)
public class RegiaoDTO {

    private String sigla;
    private GeracaoDTO geracao;
    private PrecoMedioDTO precoMedio;
    private CompraDTO compra;

}
