package com.alexsandro.ahoytest.domain;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Data
@ToString
@Entity(name = "tb_compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CollectionTable(name = "compra_valor", joinColumns = @JoinColumn(name = "id")) // 2
    @Column(name = "valor") // 3
    @ElementCollection
    private Collection<BigDecimal> valor;

}
