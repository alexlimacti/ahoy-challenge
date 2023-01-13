package com.alexsandro.ahoytest.dto;

import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Collection;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class CompraDTO {

    @ElementCollection
    private Collection<BigDecimal> valor;

}
