package com.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Recette;


public interface IRecetteRepository extends JpaRepository<Recette, Long>{

}
