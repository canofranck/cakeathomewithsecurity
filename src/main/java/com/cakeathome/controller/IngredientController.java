package com.cakeathome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakeathome.dao.IngredientDao;
import com.cakeathome.domain.Ingredient;


@RestController
@RequestMapping
@CrossOrigin("*")
public class IngredientController {

	@Autowired
	IngredientDao ingredientDao;
	
	@GetMapping("/ingredient")
	public List<Ingredient> getAllIngredients(@Validated @RequestBody(required = false)Ingredient ingredient) {
		return ingredientDao.getIngredients();		
}
	@PostMapping("/ingredient")
	public Ingredient createIngredients(@Validated @RequestBody(required = false) Ingredient ingredient) {
		return ingredientDao.saveIngredient(ingredient);
	
}
	@GetMapping("/ingredient/{id_ingredient}")
	public ResponseEntity findingredientrById(@PathVariable(name = "id_ingredient")Long id_ingredient){
		if (id_ingredient== null) {
			return ResponseEntity.badRequest().body("Je ne trouve pas le fournisseur avec son ID");
		}
		
		Ingredient ingredient = ingredientDao.getIngredientByID(id_ingredient);
		
		if (ingredient == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(ingredient); 
		
	}
	@PutMapping("/ingredients/{id_ingredient}")
	public ResponseEntity<Ingredient> updateIngredient (@Validated @PathVariable(name = "id_ingredient")Long id_ingredient, @RequestBody(required = false) Ingredient ingredient) {
		if (ingredient == null) {
			return ResponseEntity.notFound().build();
			
		}
		ingredient.setId_ingredient(id_ingredient);
		ingredientDao.updateIngredient(ingredient);
		return ResponseEntity.ok().body(ingredient);
	}
	
	@DeleteMapping("/ingredients/{id_ingredient}")
	public ResponseEntity<Ingredient> deleteIngredient (@Validated @PathVariable(name = "id_ingredient")Long id_ingredient) {
		
		Ingredient ingredient = ingredientDao.getIngredientByID(id_ingredient) ;
		
		if (ingredient == null) {
			return ResponseEntity.notFound().build();
		
	}
		ingredientDao.deleteIngredient(ingredient);
		return ResponseEntity.ok().body(ingredient); 
	
	}
	
}