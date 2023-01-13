package com.alexsandro.ahoytest.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_regiao")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sigla;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Geracao geracao;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private PrecoMedio precoMedio;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Compra compra;

}
