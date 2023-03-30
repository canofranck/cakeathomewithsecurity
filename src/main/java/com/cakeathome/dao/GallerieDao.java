package com.cakeathome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakeathome.domain.Gallerie;
import com.cakeathome.repository.IGallerieRepository;

@Service
public class GallerieDao {
	@Autowired
	IGallerieRepository gallerieRepository;

	// List Gallerie
	
	public List<Gallerie> getGalleries() {
		return gallerieRepository.findAll();

	}

	// Create  Gallerie
	
	public Gallerie saveGallerie(Gallerie gallerie) {
		return gallerieRepository.save(gallerie);

	}

	// Get Gallerie by ID
	
	public Gallerie getGallerieByID(Long gallerie_id) {
		return gallerieRepository.findById(gallerie_id).get();
	}

	// Delete Gallerie

	public void deleteGallerie(Gallerie gallerie) {
		gallerieRepository.delete(gallerie);

	}

	// Update Gallerie

	public Gallerie updateGallerie(Gallerie gallerie) {
		return gallerieRepository.save(gallerie);

	}
	public  Gallerie getGallerieByGallerieFilename(String gallerie_filename) {
		return gallerieRepository.findByGalleriefilename(gallerie_filename);
	}
	
}