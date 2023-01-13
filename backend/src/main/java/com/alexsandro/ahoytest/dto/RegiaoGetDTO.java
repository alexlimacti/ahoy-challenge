package com.alexsandro.ahoytest.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor(force = true)
public class RegiaoGetDTO {

    private String sigla;
    private GeracaoDTO geracao;
    private CompraDTO compra;

}
