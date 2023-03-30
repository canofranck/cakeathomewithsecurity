package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Recette;
import com.cakeathome.repository.IRecetteRepository;

@Service
public class RecetteDao {
	@Autowired
	IRecetteRepository recetteRepository;
	// Liste Recette

	public List<Recette> getRecettes() {
		return recetteRepository.findAll();
	}
	
	
	// create une Recette
	public Recette saveRecette( Recette recette) {
		return recetteRepository.save(recette);
	}

	// recupere une Recette par ID 
	public  Recette getRecetteByID(Long id_recette) {
		return recetteRepository.findById(id_recette).get();
	}
	// Delete une Recette
	
	public void deleteRecette(Recette recette) {
		recetteRepository.delete(recette);
	}

	// modifier une Recette
	
	public  Recette updateRecette(Recette recette) {
		return recetteRepository.save(recette);
		
	}
}
