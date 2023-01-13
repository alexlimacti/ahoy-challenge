package com.alexsandro.ahoytest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(name = "tb_agente")
public class Agente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codigo;
    private Date data;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Regiao> regiao;

}
