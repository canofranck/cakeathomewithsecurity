package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Ingredient;
import com.cakeathome.repository.IIngredientRepository;

@Service
public class IngredientDao {
	@Autowired
	IIngredientRepository ingredientRepository;
	// Listeingredient

	public List<Ingredient> getIngredients() {
		return ingredientRepository.findAll();
	}
	
	
	// create un ingredient
	public Ingredient saveIngredient(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}

	// recupere un  ingredient par ID 
	public Ingredient getIngredientByID(Long  id_ingredient) {
		return ingredientRepository.findById( id_ingredient).get();
	}
	// Delete un  ingredient
	
	public void deleteIngredient(Ingredient ingredient) {
		ingredientRepository.delete(ingredient);
	}

	// modifier un ingredient
	
	public Ingredient updateIngredient(Ingredient ingredient) {
		return ingredientRepository.save( ingredient);
		
	}
}


