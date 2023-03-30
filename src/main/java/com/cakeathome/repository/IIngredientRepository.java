package com.cakeathome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakeathome.domain.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient, Long>{

}
