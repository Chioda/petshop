package com.thiago.petshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.petshop.domain.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Integer>{

}
