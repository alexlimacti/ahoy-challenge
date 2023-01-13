package com.alexsandro.ahoytest.dto;

import jakarta.persistence.ElementCollection;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;

@Data
@ToString
public class GeracaoDTO {

    @ElementCollection
    private final Collection<BigDecimal> valor = new HashSet<>();

}
