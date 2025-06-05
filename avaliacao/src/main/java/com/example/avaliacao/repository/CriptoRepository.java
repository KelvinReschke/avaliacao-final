package com.example.avaliacao.repository;

import com.example.avaliacao.entity.Criptomoeda;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CriptoRepository extends JpaRepository<Criptomoeda, Long> {


}