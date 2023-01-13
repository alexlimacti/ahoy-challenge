package com.alexsandro.ahoytest.repository;

import com.alexsandro.ahoytest.domain.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegiaoRepository extends JpaRepository<Regiao, Long> {

    List<Regiao> findBySigla(String sigla);

}
